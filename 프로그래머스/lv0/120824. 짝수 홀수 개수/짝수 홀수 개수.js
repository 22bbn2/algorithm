function solution(num_list) {
    var answer = [0,0];
    num_list.forEach((n,i) => {
        if(n%2 == 0)
        {
            return answer[0]++;
        }
        else
        {
            return answer[1]++;
        }
    })
    return answer;
}