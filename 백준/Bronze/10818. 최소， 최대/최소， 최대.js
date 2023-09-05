// readline 모듈보다는 fs를 이용해 파일 전체를 읽어 들여 처리하기
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
// /dev/stdin

let cnt = input[0];
let data = input[1].split(' ').map(x => Number(x)); // 숫자로 초기화

let big = data[0];
let small = data[0];

for(var i = 1 ; i < cnt ; i++)
{
    if(big < data[i])
    {
        big = data[i];
    }

    if(small > data[i])
    {
        small = data[i];
    }
}

console.log(small,big);