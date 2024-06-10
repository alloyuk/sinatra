var mysql = require("mysql");
var conn = mysql.createConnection({
   host: "localhost",
   user: "root",
   password: "zxcg1114",
   database: "mytest",
   dateStrings :"date"
});

conn.connect();



const express = require('express');
const app = express();
const sha = require('sha256');

const bodyparser = require('body-parser');

app.use(bodyparser.urlencoded({extended:true}));

app.set('view engine', 'ejs');

app.use(express.static('../img'));

app.listen(8080, function() {
   console.log("포트 8080으로 서버 대기중...")
});




app.get('/img', function(req,res){
  res.sendFile(path.join(__dirname, 'public', 'img', '6540.jpg'));
});


app.get("/", function (req, res) {
   res.render("index.ejs");
});



app.get('/list', function(req, res){
   let sql="select * from post";
   conn.query(sql, function (err, result) {
      if(err) throw err;
      console.log(result);
      res.render('list.ejs', { data : result });
   });

});


app.get('/menu', function(req,res) {
   conn.query("select * from consumer", function (err, rows, fields) {
      if (err) throw err;
      console.log(rows);
   });
}); // 데이터 추가 방법

//'/enter' 요청에 대한 처리 루틴
app.get('/enter', function(req, res){
   res.render('enter.ejs');
});


//'/save' 요청에 대한 post 방식의 처리 루틴
app.post('/save', function(req, res){
   console.log(req.body.title);
   console.log(req.body.content);
   let sql = "insert into post (title, content, created) values(?, ?, ?)";
   let parames = [req.body.title, req.body.content, req.body.someDate];
   conn.query(sql, parames, function (err, result) {
      if(err) throw err;
      console.log('데이터 추가 성공');
   });
   res.redirect("/list");
}); 


app.post("/delete", function(req,res){
   console.log(req.body.id);
   let sql="delete from post where id = ?";
   let param = req.body.id;
   conn.query(sql,param,function(err,result){
     if(err) throw err;
     console.log("삭제 완료");
     res.status(200).send();
   });
   
 })
 
app.get("/content/:id",function(req,res){
   console.log(req.params.id);
   let sql="select * from post where id=?";
   let params=req.params.id;
   conn.query(sql,params,function(err,result){
     if(err) throw err;
     console.log(result);
     res.render("content.ejs",{data : result});
   });
   
 });
   
 app.get("/edit/:id", function (req, res){ 
   console.log(req.params.id);
   let sql="select * from post where id=?";
   let params=req.params.id;
   conn.query(sql,params,function(err,result){
     if(err) throw err; 

     console.log(result);
     res.render("edit.ejs",{data : result}); 
   });
 });


 app.post("/edit", function(req, res){
   let sql="update post set title=?, content=?, created=? where id=?";
   let params=[req.body.title, req.body.content, req.body.someDate, req.body.id];
   conn.query(sql,params,function(err,result){
     if(err) throw err; 

     console.log(result);
     res.render('/list'); 
   });
});

app.use(express.static('public'));

app.get('/profile', function(req,res) {
   res.render('profile.ejs');
});

app.get('/open', function(req,res) {
   res.render('open.ejs');
});

let cookieParser = require('cookie-parser');

app.use(cookieParser('ncvka0e398423kpfd')); // 보안화
/*app.get('/cookie', function(req,res){
   res.cookie('milk', '1000원');
   res.send('product : ' + req.cookies.milk);
});*/


app.get("/cookie", function (req,res) {
   let milk = parseInt(req.signedCookies.milk) + 1000;
   if(isNaN(milk))
      {
         milk = 0;
      }
      res.cookie("milk", milk, {signed : true});
      //res.cookie("milk", milk, {maxAge : 1000}); 초 주기 주는 것
      res.send("product : " + milk + "원");
});

//세션 방식 예제
let session = require('express-session');
app.use(session({
   secret : 'dkufe8938493j4e08349u',
   resave : false,
   saveUninitialized : true
}))

app.get("/session", function (req, res) {
   if(isNaN(req.session.milk)){
      req.session.milk = 0;
   }
   req.session.milk = req.session.milk + 1000;
   res.send("session : " + req.session.milk + "원");
});


//로그인
app.get("/login", function (req,res) {
   console.log(req.session);
   if(req.session.user){
      console.log('세션 유지');
      res.render('index.ejs', { user : req.session.user});
   }else{
      res.render("login.ejs");
   }
});

app.post("/login", function (req,res){
   console.log("아이디 : " + req.body.userid);
   console.log("비밀번호 : " + req.body.userpw);

   let sql="select * from login where userid = ?";
   let parames = req.body.userid;
   conn.query(sql, parames, function (err, result) {
      if(err) throw err;
      if(result[0].userpw == sha (req.body.userpw)) {
      req.session.user = req.body;
      console.log('새로운 로그인');
      res.render('index.ejs', { user : req.session.user});
      }else {
   
      res.render('login.ejs');
   
      }
   });  
});

app.get("/logout", function (req,res){
   console.log("로그아웃");
   req.session.destroy(function(err) {
      if(err) throw err;
      res.redirect("/");

   });
  
});


app.get("/signup", function(req,res){
   res.render("signup.ejs");
});

app.post("/signup", function (req,res){
 
   console.log(req.body.userid);
   console.log(sha(req.body.userpw));
   console.log(req.body.usergroup);
   console.log(req.body.useremail);

   let sql = "insert into login (userid, userpw, usergroup, useremail) values(?, ?, ?, ?)";
   let parames = [req.body.userid, sha(req.body.userpw), req.body.usergroup, req.body.useremail];
   conn.query(sql, parames, function (err, result) {
      if(err) throw err;
      console.log('회원가입 성공');
   });
   res.redirect("/");
});

app.post('/photo', function(req, res) {
   console.log("서버에 파일 첨부하기");
})

let multer = require('multer');

let storage = multer.diskStorage({
   destination : function(req, file, done) {
      done(null, './public/img')
   },
   filename : function(req, file, done) {
      done(null, file, originalname)
   }
})

let upload = multer({storage : storage});


/*완전히 새로운 데이터 연계 실험 임시 폐기
app.get('/request', function(req,res) {
   res.render('request.ejs');
});

app.get('/request', function(req, res){
   let sql="select * from retake";
   conn.query(sql, function (err, result) {
      if(err) throw err;
      console.log(result);
      res.render('request.ejs', { datas : result });
   });

});

app.get("/contents/:id",function(req,res){
   console.log(req.params.id);
   let sql="select * from retake where id=?";
   let params=req.params.id;
   conn.query(sql,params,function(err,result){
     if(err) throw err;
     console.log(result);
     res.render("contents.ejs",{datas : result});
   });
   
 });

app.post("/deletes", function(req,res){
   console.log(req.body.id);
   let sql="delete from retake where id = ?";
   let param = req.body.id;
   conn.query(sql,param,function(err,result){
     if(err) throw err;
     console.log("삭제 완료");
     res.status(200).send();
   });
   
 })

 //'/save' 요청에 대한 post 방식의 처리 루틴
app.post('/saves', function(req, res){
   console.log(req.body.title);
   console.log(req.body.content);
   let sql = "insert into retake (title, content, created) values(?, ?, ?)";
   let parames = [req.body.title, req.body.content, req.body.someDate];
   conn.query(sql, parames, function (err, result) {
      if(err) throw err;
      console.log('데이터 추가 성공');
   });
   res.redirect("/request");
}); 

 app.get("/edits/:id", function (req, res){ 
   console.log(req.params.id);
   let sql="select * from retake where id=?";
   let params=req.params.id;
   conn.query(sql,params,function(err,result){
     if(err) throw err; 

     console.log(result);
     res.render("edits.ejs",{datas : result}); 
   });
 });

 app.post("/edits", function(req, res){
   let sql="update retake set title=?, content=?, created=? where id=?";
   let params=[req.body.title, req.body.content, req.body.someDate, req.body.id];
   conn.query(sql,params,function(err,result){
     if(err) throw err; 

     console.log(result);
     res.render('/request'); 
   });
}); */

app.post('/insert', function(req, res){
   console.log(req.body.title);
   console.log(req.body.content);
   let sql = "insert into retake (title) values(?)";
   let parames = [req.body.title];
   conn.query(sql, parames, function (err, result) {
      if(err) throw err;
      console.log('데이터 추가 성공');
   });
   res.redirect("/content");
}); 