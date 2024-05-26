class Solution {
    public int solution(int a, int b) {
        int answer;
        String answer1;
        String answer2;
        
        answer1 = String.valueOf(a) + String.valueOf(b);
        answer2 = String.valueOf(b) + String.valueOf(a);
        
        if(Integer.parseInt(answer1) > Integer.parseInt(answer2)){
            answer = Integer.parseInt(answer1);
        }else{
            answer = Integer.parseInt(answer2);
        }
        
        return answer;
    }
}