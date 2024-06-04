class Solution {
    public int[] solution(int start_num, int end_num) {
        int cnt = start_num-end_num;
        int[] answer = new int[cnt+1];

        for(int i = 0 ; i <= cnt ; i++){

            answer[i] = start_num;
            start_num = start_num -1;
        }
        return answer;
    }
}