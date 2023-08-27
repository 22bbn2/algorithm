// readline 모듈보다는 fs를 이용해 파일 전체를 읽어 들여 처리하기
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
// /dev/stdin

// let cnt = 9;
// let data = input[1].split(' ').map(x => Number(x)); // 숫자로 초기화

let big = 0;
let bigNum = 0;

for(var i = 0 ; i < 9 ; i++)
{
    if(big < Number(input[i]))
    {
        big = Number(input[i]);
        bigNum = i;
    }
}

console.log(big);
console.log(bigNum+1);