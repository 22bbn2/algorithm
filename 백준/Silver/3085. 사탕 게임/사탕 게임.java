import java.util.Scanner;

public class Main {
    static int n;
    static char[][] board;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        board = new char[n][n];

        // 배열 만들어주기
        for(int i =0; i<n ; i++){
            String candy = scanner.next();
            for(int j =0; j<n ; j++){
                board[i][j] = candy.charAt(j);
            }
        }

        // 사탕 짱많이 먹을 수 있는 갯수
        int maxCandies = 0;

        // 교환하고 다시 돌려놔 준 후에 최대 캔디 개수를 계산해야함
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                // 오른쪽으로 돌리기
                if(j+1 < n){
                    swap(i,j,i,j+1);
                    maxCandies = Math.max(maxCandies, getMaxCandies());
                    swap(i,j,i,j+1); // 자리 원복
                }
                // 아래로 돌리기
                if(i+i < n){
                    swap(i,j,i+1,j);
                    maxCandies = Math.max(maxCandies, getMaxCandies());
                    swap(i,j,i+1,j); // 자리 원복
                }
            }
        }

        System.out.println(maxCandies);
    }

    // 바꿔치기
    private static void swap(int x1, int y1, int x2, int y2){
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    static int getMaxCandies() {
        int max = 0;

        // 행으로 돌리기
        for (int j = 0; j < n; j++) {
            int count = 1;
            for(int i = 1; i <n ; i++){
                if(board[i][j] == board[i-1][j]){
                    count++;
                }
                else{
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
        }

        // 열로 돌리기
        for (int i = 0; i < n; i++) {
            int count = 1;
            for(int j = 1; j <n ; j++){
                if(board[i][j] == board[i][j-1]){
                    count++;
                }
                else{
                    max = Math.max(max,count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
