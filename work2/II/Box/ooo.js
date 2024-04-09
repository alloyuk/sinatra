// function(함수)
// 어떤 목적을 가지고 작성한 코드를 모아 둔 블록
// 특정 동작(기능)을 수행하는 일부 코드의 집합(부분)
// 함수를 만드는 이유
//   -반복적인 작업일 때
//   -input을 받아서 output를 반환해야 할 때

/*document.write('3 * 1 = ' + 3 * 1 + '<br>');
document.write('3 * 2 = ' + 3 * 2 + '<br>');
document.write('3 * 3 = ' + 3 * 3 + '<br>');
document.write('3 * 4 = ' + 3 * 4 + '<br>');
document.write('3 * 5 = ' + 3 * 5 + '<br>');
document.write('3 * 6 = ' + 3 * 6 + '<br>');
document.write('3 * 7 = ' + 3 * 7 + '<br>');
document.write('3 * 8 = ' + 3 * 8 + '<br>');
document.write('3 * 9 = ' + 3 * 9 + '<br>');

/* for(let i = 1; i <= 3; i++) {
  for(let j = 1; j <= 9; j++) {
    document.write(i+'x' +j + '=' + i*j + '<br>');
  }
} */

/* for(let i = 1; i <= 9; i++) {
  document.write(`3 * ${i} = ${3 * i}`+ '<br>');
} */
// 중첩문

/* function gugugu() {
  for(let i = 1; i <= 9; i++) {
    document.write(`3 * ${i} = ${3 * i}`+ '<br>');
  }
} */ // 함수 표현식!2


//gugugu();

//함수를 정의하는 방법
//  function 함수명() {}
// 함수를 실행/호출
//  함수명();

// 함수 표현식으로 함수 정의
// 함수는 객체에서 파생된 자료형, 자료형은 변수에 할당
// const 변수명 = function() {} --> 익명 함수
// const 변수명 = function 함수명() {} --> 네이밍함수

/* const gugu = function gugu() { // 변수명과 함수명을 쓸때는 똑같이 쓰는거 추천, 다르게 쓰면 헷갈림ㅇ
  for ( let i = 1; i <=9; i++){
    document.write(`3 * ${i} = ${3 * i}`+ '<br>');
  }
}// 함수 표현식!

gugu();//함수 호출!

// 화살표 함수(가장 많이 사용되는 방법)
//  () => {};
// 익명함수로만 정의할 수 있음
// 함수 표현식으로 사용


/* const gugugu = () => {
  for(let i=1; i<=9; i++){
    document.write(`3*${i} = ${3*i}` + '<br>');
  }// for문의 경우 세미콜론 생략, 블록문이라서
};

gugugu();*/

//예약어?



/*let num = 10;
console.log(num);
num = 10; */

// parameter(매개변수)와  (argument)인수
// parameter : 외부에서 전달되는 데이터를 함수에서 받을 수 있도록 정의하는 변수
// argument : 함수를 호출할 때 전달하고 싶은 데이터
/*const gugugu = () => {
  for(let i = 1; i<=9; i++){
    document.write(`5*${i} = ${5*i}` + '<br>');
  }
};
gugugu();*/

/*function gugugu(dan) {
  for(let i = 1; i <= 9; i++) {
    document.write(`${dan} * ${i} = ${dan * i}`+ '<br>');
  }
} */  // 함수 표현식!2

/*gugugu();  */// 괄호 안에 숫자 호출하고 싶은것

/*const gugugu = (dan) => {
  for(let i = 1; i <= 9; i++) {
    document.write(`${dan} * ${i} = ${dan * i}`+ '<br>');
  }
};

gugugu(2); */

// return문
// 함수 외부로 데이터를 반환할 때
// return 식(또는 값)


/* function sum(num1, num2){
  let result = num1 + num2;
  //console.log('lnner: ' + result);
  return result;
  //return num1 + num2;
}
const result = sum(10, 20);
console.log('out : ' + result);  */

/* function sum(num1, num2) {
  if(typeof num1 !== 'number' || typeof num2 != 'number'){
    return;// 매개변수가 숫자가 아니면 강제종료
  }
  let result = num1 + num2;
}
const result = sum('a', 'b');
console.log('out : '+ result); */

// 화살표함수에서
// return 문으로 처리
// const sum = (num1, num2) => num1 + num2; 자동으로 리턴
// const result = sum(10,20);
// console.log(result);

// scope(스코프)
// 변수나 함수와 같은 참조 대상 식별자를 찾아 내기 위한 규칙
// 함수 스코프 : 함수에서 정의된 블록내에서만 사용
// 블록 스코프 : {}로 구성된 블록문 기준으로 스코프의 유효범위를 나누는 방식
//               let, const 선언 
// 전역(글로벌) 스코프
// 지역(로컬) 스코프

/* let a =10; // 전역변수
{
  let b = 20; // 지역변수
  console.log(`코드블록 내부 a: ${a}`);
  console.log(`코드블록 내부 b: ${b}`);
}
console.log(`코드블록 외부 a: ${a}`);
console.log(`코드블록 외부 a: ${b}`); // defined */

//즉시실행함수
//함수를 정의하면서 동시에 실행까지
// (function(){})();
(function init(a, b){
  console.log('즉시실행함수');
  console.log(a + b);
})(10, 20);



