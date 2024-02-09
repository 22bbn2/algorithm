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
let arr1 = input[0].split(' ').map(Number);
let arr2 = input[1].split(' ').map(Number);

arr2.sort(function(a,b){
    if(a>b) return 1;
    else if(a<b) return -1;
    else return 0;
});

console.log(arr2[arr1[1]-1]);
return;