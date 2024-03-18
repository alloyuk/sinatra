// 조건문 : 프로그램의 흐르을 변경
/* if(조건식) {
  조건식이 참이면 블록문 실행
} */
/* if(조건식) {
  조건식이 참이면 블록문 실행
} else {
  조건식이 거짓이면 블록문 실행
} */
/* if(조건식1) {
  조건식1이 참이면 실행
} else if(조건식2) {
  조건식1이 거짓이고 조건이2가 참이면 실행
} else {
  조건식1과 조건식2가 모두 거짓이면 실행
}*/

/*let num = prompt("계산할 값을 입력하세요", "숫자");
if(num % 4) {
  document.write("4의 배수");
} else if(num %2) {
  document.write("짝수");
} else {
  document.write("홀수");  

}*/

/*if(gender == 1 || gender == 3){
  document.write('남자입니다.');
}else if(gender == 2 || gender == 4){
  document.write('여자입니다.');
}else {
  document.write('값을 잘못 입력');
}*/

// switch 문
/* switch(키, 옵션값) {
  case 키값1:
    키가 키값 1일 때 실행할 블록문
  break;
  case 키값2:
    키값이 2일 때 실행할 블록문
  break;
  caes 키값3:
    키값이 3일 때 실행할 블록문
  break;
  default;
    일치하지 않을 때 실행할 블록문
  break;
} 
let gender = Number (prompt('성별의 값(1,2,3,4)을 입력하세요.'));

switch(gender) {
  case 1:
  case 3:
    document.write('남자입니다.');
    break
  case 2:
  case 4:
    document.write('여자입니다.');
    break;
  default:
    document.write('값을 잘못 입력하셨습니다.')
    break;
} */

// 반복문 : 조건이 참인 경우 블록문을 반복 실행
// for(변수선언; 종료 조건; 변수증감)
// 단항산술연산자 - i++/ ++i / i-- / -i
// 대입연산자 : =
// 복합대입연산자 : x += y --> x에 x+y 를 대입 x = x + y
// x -= y, *=, /=, %=

/*for(let i = 5; i > 0; i--){ //역순
  document.write(i + '<br>');
}*/

/* while(조건식) { 
  조건식이 참이면 실행
}*/

/* let num = 1;
while(num <= 5) {
  document.write(num + '<br>');
  num++;
}
do {
  document.write('무조건실행');
}while(false); */

// for 문 중첩
/* for(let i = 0; i < 2; i++) {
  document.write(`i: ${i}` + '<br>');
  for(let k = 0; k < 2; k++) {
    document.write(`k: ${k}` + '<br>');
  }
} */

/* for(let i = 1; i <= 3; i++) {
  for(let j = 1; j <= 9; j++) {
    document.write(i+'' +j + '=' + i*j + '<br>');
  }
}

for(let i = 0; i < 100; i++){
  if(i % 3 == 0) continue;
  if(i > 10) break;
  document.write(i + '<br>');
} */


/*let sum =0;
for(let i = 1; i<= 1000; i++){
  sum = sum +1;
  document.write(sum +'<br>')

} */



/*let sum = 0;
for(let i = 1; i <= 100; i++) {
  sum = sum + i;
}
document.writeln(sum);




/*
if(num % 4) {
  else if(num % 2) {
    document.write("홀수입니다");
    } else if {
      document.write("짝수입니다.")
    } 
  } else {
    document.write("4의 배수입니다.");
}

//let strNum = '10';
//let num = 10;
//document.write(Number (strNum) + num); // 20으로 가는 길
//괄호 안의 안에 있는 데이터의 타입을 숫자로 변경해줌
//문자로 변경하고 싶으면 string으로

//if(Number (num) % 2 == 0){
  // document.write("짝수입니다!");
  //confirm("같다");
//} else {
  //document.write("다르다"); } */



// 문제1) 1부터 1000까지의 짝수 개수
// 짝수의 개수는 000개입니다.
// 문제2) 1부터 100까지의 합을 출력하는 코드를 작성해 
//
//메일의 본문으로 코드만

/*  for(let i=0; i<100; i++){
    if(i % 3 == 0) continue;
    if(i > 10) break;
    document.write(i+'<br>');

  }

  let count = 0;
  for(let i = 1; i <= 1000; i++){
    if(i % 2 ==0) count++;
  
  }
  document.write('짝수의 개수는'+ count + '개 입니다.');

  let sum = 0;
  for(let i = 1; i<=100; i++){
    sum+=i;
  }
  document.write('합계는' + sum + '입니다.'); */

// for문과 배열
const fruits = ['사과', '포도', '바나나'];
console.log(fruits);
document.write(fruits); 


//2가지가 있다. const와 let
/* let arr = ['애플', '그레이프', '바나나'];
for(let i = 0; i<3; i++){ , 3 = arr.length;
  document.write(arr[i] + '<br>');
}
document.write(arr[1]); */  //이것도 가능하고 

// 배열 push!, n.length

//for ..in
// for(변수 in 배열/객체){ }
for(let i in arr) {
  document.write(i + ':' +arr[i] + '<br>');
}

let obj = {name:"홍길동", age:20};
document.write(obj.age); {
  document.write(i+ ':'+ obj[i]);
}


