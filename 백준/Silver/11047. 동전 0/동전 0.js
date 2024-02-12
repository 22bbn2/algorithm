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

let [N,K] = input[0].split(" ").map(Number);

let coin = new Array(); // 동전꾸러미

for(let i = 1 ; i <= N ; i++)
{
    coin.push(Number(input[i]));
}

coin.sort(function(a,b){
    return b - a;
});

let cnt = 0;

for(let p of coin){
    cnt += Math.floor(K/p);
    K = K%p;
}

console.log(cnt);
