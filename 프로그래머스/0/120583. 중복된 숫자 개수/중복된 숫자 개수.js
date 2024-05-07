function solution(array, n) {
    var answer = 0;

    return array.filter(x => x === n).length;
}