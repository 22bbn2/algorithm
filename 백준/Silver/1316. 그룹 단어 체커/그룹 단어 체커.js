const fs = require('fs')

const getInput = (filePath) => {
    return fs
        .readFileSync(filePath)
        .toString()
        .split(/\n/);
        // .map((elem) => (elem.split(" ")));
    }
    
const input = getInput('/dev/stdin'); // 제출시 여기 '/dev/stdin' 으로 변경

function check(inp)
{
    let setData = new Set(inp[0]);

    for(var i = 0; i < inp.length-1 ; i++)
    {
        // 만약 뒷자리 값과 다른 경우
        if(inp[i] != inp[i+1])
        {
            // 기존에 있던 값인지 비교
            if(setData.has(inp[i+1]))
            {
                return false;
            }
            else
            {
                setData.add(inp[i+1]);
            }
        }
    }

    return true;
}

let sum = 0;

for(let j = 1 ; j <= input[0] ; j++)
{
    if(check(input[j])) sum += 1;
}

console.log(sum);