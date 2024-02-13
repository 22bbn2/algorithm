// readline 모듈보다는 fs를 이용해 파일 전체를 읽어 들여 처리하기
const fs = require('fs')

const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "test.txt")
  .toString()
  .trim()
  .split("\n");

function solution(data) {
    let N = Number(data[0]);
    let myMap = new Map;
    let dataOrg = input[1].split(' ').map(Number);

    dataOrg.sort(function(a,b){
        return a - b;
    });

    let sum = 0;
    let sum2 = 0;
    for(let p of dataOrg){
        sum += p;
        sum2 += sum;
    }

    console.log(sum2);
    return;
}

solution(input);