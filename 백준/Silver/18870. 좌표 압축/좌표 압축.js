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

let count = Number(input[0]);
let dataOrg = input[1].split(' ').map(Number);

// 중복제거
data = [...new Set(dataOrg)]; // 중복제거

data.sort(function(a,b){
    if(a>b) return 1;
    else if(a<b) return -1;
    else return 0;
});

// dictionary 형태로 mapping
let myMap = new Map();
for(let i = 0; i < data.length ; i++){
    myMap.set(data[i],i);
}

let answer= "";
for(p of dataOrg)
{
    answer += myMap.get(p) + " ";
}

console.log(answer);