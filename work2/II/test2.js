let array = [273, 52, 103, 57, 271];

let sum = prompt("숫자")


let min = Number.MAX_VALUE;
let max = Number.MIN_VALUE;
for(let a of array) {
  if(a > max){
    max = a;
  }
  if(a<min){
    min=a;
  }
}
document.write('가장 큰 수는 '+max+' 입니다.'); 
//console.log(`가장 큰 수: ${max}`);
//console.log(`가장 작은 수: ${min}`);