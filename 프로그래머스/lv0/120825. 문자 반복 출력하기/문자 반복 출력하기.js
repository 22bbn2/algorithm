function solution(my_string, n) {
    var answer = [...my_string].map(a => a.repeat(n)).join("")
    return answer;
}