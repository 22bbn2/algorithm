function solution(numbers) {
    var answer = 0;
    
    numbers.forEach((n,i) => {
        answer += n;
    })
    return answer/numbers.length;
}