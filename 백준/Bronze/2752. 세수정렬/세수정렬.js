// readline 모듈보다는 fs를 이용해 파일 전체를 읽어 들여 처리하기
const fs = require('fs')

const getInput = (filePath) => {
    return fs
        .readFileSync(filePath)
        .toString()
        .split(/\n/);
    }

const input = getInput('/dev/stdin'); // 제출시 여기 '/dev/stdin' 으로 변경
let arr = input[0].split(' ').map(Number);

arr.sort(function(a,b){
    return a-b;
});

let answer = "";
for(let i=0;i<arr.length;i++)
{
    answer += arr[i] + " ";
}

console.log(answer);