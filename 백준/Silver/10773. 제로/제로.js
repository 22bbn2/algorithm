const fs = require('fs')

const getInput = (filePath) => {
    return fs
        .readFileSync(filePath)
        .toString()
        .split(/\n/);
        // .map((elem) => (elem.split(" ")));
    }

const input = getInput('/dev/stdin'); // 제출시 여기 '/dev/stdin' 으로 변경

function calculateTotalSum(K, numbers) {
  const stack = [];

  for (let i = 0; i < K; i++) {
    const num = numbers[i];
    if (num == 0) {
      stack.pop(); // 가장 최근에 쓴 수를 지움
    } else {
      stack.push(num); // 해당 수를 씀
    }
  }

  let sum = 0;
  while (stack.length > 0) {
    sum += Number(stack.pop()); // 스택에 남아있는 수들의 합을 계산
  }

  return sum;
}

var aa = Array();
for(var i = 1 ; i <= input.length - 1 ; i++)
{
    aa.push(input[i]);
}
console.log(calculateTotalSum(input[0],aa));