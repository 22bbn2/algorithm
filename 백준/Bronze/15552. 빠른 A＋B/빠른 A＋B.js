// readline 모듈보다는 fs를 이용해 파일 전체를 읽어 들여 처리하기
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
// /dev/stdin

let cnt = input[0];
let answer = '';

for(var i = 1 ; i <= cnt ; i++)
{
    let data = input[i].split(' ');
    answer += Number(data[0]) + Number(data[1]) + '\n';
}

console.log(answer);