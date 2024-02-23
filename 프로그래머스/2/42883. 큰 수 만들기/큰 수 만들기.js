function solution(number, k) {
    var answer = [];
    
    for(let num of number)
    {
        while(k>0 && answer[answer.length - 1] < num)
        {
            answer.pop(); // 들어온 숫자가 마지막 입력값 보다 큰 경우 기존 있던 친구 제거
            k--;
        }
        
        answer.push(num); // k값이 다 끝나면 나머지 넣기
    }
    
    answer = answer.join("").slice(0, answer.length - k);
    
    return answer;
}