// 객체 : 직접 정의에서 사용, 이미 만들어져 있는 것 사용
//    웹브라우저가 제공하는 객체
//
//객체를 자료형의 관점에서 키(key)와 값(value) 구성원 속성의 집합
//const person = {
  /* name: '홍길동,'
  name:['홍','길동'], */
 /* name: {
    firstName: '홍',
    lastNmae: '길동'
  },
  likes: ['apple','football'],
  age:20,
  isAdult: true,
  printInfo: function(){ // 메서드(method)
    return 'hello!!';
  }  
};

// 객체의 속성에 접근하는 방법
//document.write(person.name);
//document.write(person["name"]);
//document.write(person["age"]);
document.write(person.likes[0]);
//console.log(person["printInfo"]());
console.log(person.printInfo());

// 객체와 속성 값을 변경
person.age = 30;
console.log(person.age);

// 객체의 속성 추가하기
person.gender = "남자";
console.log(person); */

// 문서 객체 모델(DOM)
// 속성값과 태그명 선택하기
// get 메서드
const elTitle = document.getElementById('title');
console.log(elTitle);

const elText = document.getElementsByClassName('text');
console.log(elText);
console.log(elText[1]);

const tagName = document.getElementsByTagName('p');
console.log(tagName);


// CSS 선택자 사용
// query 메서드
const boxEl = document.querySelector('.box');
console.log(boxEl);
const cssEl = document.querySelectorAll('.text');
console.log(cssEl);