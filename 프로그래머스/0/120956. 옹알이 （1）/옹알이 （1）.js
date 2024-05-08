function solution(babbling) {
  var answer = 0;
  let can = ["aya", "ye", "woo", "ma"];

  for (let i in babbling) {
    let init = babbling[i];

    for (let j in can) {
      if (babbling[i].includes(can[j])) {
        init = init.replace(can[j], "");  // 할 수 있는 단어는 공백으로 치환
      }
    }

    if (init.length === 0) {  // 공백이 되면 answer에 추가
      answer += 1;
    }
  }
  return answer;
}