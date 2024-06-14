import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int N = sc.nextInt();
       int[][] questions = new int[N][3];
       
       for (int i = 0; i < N; i++) {
            questions[i][0] = sc.nextInt(); // 질문 숫자
            questions[i][1] = sc.nextInt(); // 스트라이크 수
            questions[i][2] = sc.nextInt(); // 볼 수
        }
        
        int validCount = 0;
        
        for (int num = 123; num <= 987; num++) {
            String numStr = Integer.toString(num);
            
            // 숫자에 0이 포함되거나 중복된 숫자가 있는지 확인하기
            if (!isValid(numStr)) {
                continue;
            }
            
            boolean valid = true;
            
            // 각 질문에 대해 조건을 확인
            for (int i = 0; i < N; i++) {
                String questionStr = Integer.toString(questions[i][0]);
                int strikes = questions[i][1];
                int balls = questions[i][2];
                
                int[] result = countStrikeAndBall(numStr, questionStr);
                int strikes2 = result[0];
                int balls2 = result[1];
                
                if(strikes != strikes2 || balls != balls2 ){
                    valid = false;
                    break;
                }
            }
            
            
            if(valid){
                validCount++;
            }
        }
        
        System.out.println(validCount);
        sc.close();
    }
    
    // 숫자 검증
    private static boolean isValid(String num){
        if(num.contains("0")){
            return false;
        }
        
        // 중복 숫자 등장 검사
        for(int i=0; i<=2 ;i++){
            if(num.indexOf(num.charAt(i)) != num.lastIndexOf(num.charAt(i))){
                return false;
            }
        }

        return true;
    }
    
    // num = 받은 숫자, ques = 반복돌리는숫자중하나,,
    // 입력받은 숫자가 특정 숫자에 얼마나 맞는지 검증하는 함수?
    private static int[] countStrikeAndBall(String num,String ques){
        int strikes = 0;
        int balls = 0;
        
        for(int i =0; i < 3 ;i++){
            if(num.charAt(i)==ques.charAt(i)){
                strikes ++;
            }else if(ques.contains(Character.toString(num.charAt(i)))){
                balls ++;
            }
        }
        return new int[]{strikes, balls};
    }
    
}