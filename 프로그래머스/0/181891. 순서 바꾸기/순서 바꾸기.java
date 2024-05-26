class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        
        for(int i = 0 ; i < num_list.length-n  ; i++){
            answer[index++] = num_list[i+n];
        }
        
        for(int i = 0 ; i <= n - 1  ; i++){
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}