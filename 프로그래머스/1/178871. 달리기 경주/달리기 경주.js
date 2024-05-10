function solution(players, callings) {
    const n = players.length;
    const map = {};
    
    // 선수 이름과 등수를 매핑
    for (let i = 0; i < n; i++) {
        map[players[i]] = i;
    }

    for (let i = 0; i < callings.length; i++) {
        const calling = callings[i];
        const currentRank = map[calling];
        
        // 호출된 선수가 1등이 아닌 경우만 처리
        if (currentRank !== 0) {
            // 이전 등수와 현재 등수를 교환
            const temp = players[currentRank - 1];
            players[currentRank - 1] = players[currentRank];
            players[currentRank] = temp;
            
            // 등수를 업데이트
            map[calling] = currentRank - 1;
            map[temp] = currentRank;
        }
    }
    
    return players;
}