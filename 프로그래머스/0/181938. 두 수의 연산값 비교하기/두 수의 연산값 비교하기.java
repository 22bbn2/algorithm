class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ans1;
        int ans2;
        
        ans1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        ans2 = 2 * a * b;
        
        if(ans1 > ans2){
            answer = ans1;
        } else{
            answer = ans2;
        }
        
        return answer;
    }
}