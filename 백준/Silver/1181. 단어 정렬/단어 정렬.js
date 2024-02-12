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
let data = new Array();

for(let i = 1; i <= count ; i++){
    data.push(input[i]);
}

data = [...new Set(data)]; // 중복제거

function compare(a,b)
{
    if(a.length != b.length)
    {
       return a.length - b.length;
    }
    else // 길이가 같으면 사전 순으로
    {
        if(a>b) return 1;
        else if(a<b) return -1;
        else return 0;
    }
}

data.sort(compare);

for (let x of data)
{
    console.log(x);
}
