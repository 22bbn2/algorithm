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
let dataOrg = new Array();
// let dataOrg = input[1].split(' ').map(Number);
for(let i = 1 ; i <= count ; i++)
{
    let age = Number(input[i].split(" ")[0]);
    let name = input[i].split(" ")[1];
    dataOrg.push([age,name]);
}

dataOrg.sort(function(a,b){
    if(a[0] != b[0])
    {
       return a[0] - b[0];
    }
    else // 나이가 같으면 가입순
    {
        return 1;
    }
});

let ans = "";
for(let p of dataOrg){
    ans += p[0] + " " + p[1] + "\n";
}

console.log(ans);