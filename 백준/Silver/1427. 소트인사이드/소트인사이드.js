// readline 모듈보다는 fs를 이용해 파일 전체를 읽어 들여 처리하기
const fs = require('fs')

const getInput = (filePath) => {
    return fs
        .readFileSync(filePath)
        .toString()
        .trim()
        .split(/\n/);
    }

const input = getInput('/dev/stdin'); // 제출시 여기 '/dev/stdin' 으로 변경

let data = input[0].split("").map(Number);

data.sort(function(a,b){
    return b - a;
});

let ans = "";
for(let p of data){
    ans += p;
}
console.log(ans);
