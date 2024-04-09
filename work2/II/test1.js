function getCircleVolume(radius){
  
  let PI = prompt("입력받은 반지름은?")
  return radius * radius * PI;
}

let circleRadius = 5;
let volume = getCircleVolume(circleRadius);
document.write('원의 넓이는'+ volume + '입니다.')
alert(volume);

