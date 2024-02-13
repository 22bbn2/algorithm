// readline 모듈보다는 fs를 이용해 파일 전체를 읽어 들여 처리하기
const fs = require('fs')

const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "test.txt")
  .toString()
  .trim()
  .split("\n");

// data[0].split('-').map(Number);
function solution(data) {
    // -를 기준으로 가장 크게 묶어야 가장 최소로 만들 수 있음
    let dataOrg = data[0].split('-');
    let dat = 0;
    let sum = 0;

    for(let i = 0 ; i < dataOrg.length ; i++){
        dat = dataOrg[i].split("+").map(Number).reduce((acc,curr) => acc + curr , 0);
        if(i==0){
            sum += dat;
            continue;
        }
        sum -= dat;
    }
    
    console.log(sum);
    return;
}

solution(input);