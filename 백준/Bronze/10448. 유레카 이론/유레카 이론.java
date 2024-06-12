import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // 삼각수를 최대값 1000까지 생성
        ArrayList<Integer> triangleNumbers = triangleNumbers(1000);

        for (int t = 0; t < T; t++) {
            int K = sc.nextInt();
            if (isEureka(K, triangleNumbers)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }

    // 삼각수를 계산하여 리스트에 저장하는 함수
    public static ArrayList<Integer> triangleNumbers(int limit) {
        ArrayList<Integer> triangleNumbers = new ArrayList<>();
        int n = 1;
        while (true) {
            int triangleNumber = n * (n + 1) / 2; // 삼각함수 공식, 미리 숫자 저장
            if (triangleNumber > limit) break;
            triangleNumbers.add(triangleNumber);
            n++;
        }
        return triangleNumbers;
    }

    // 3개 더해보자...님 삼각수의 합으로 표시 됨?
    public static boolean isEureka(int number, ArrayList<Integer> triangleNumbers) {
        for (int i = 0; i < triangleNumbers.size(); i++) {
            for (int j = 0; j < triangleNumbers.size(); j++) {
                for (int k = 0; k < triangleNumbers.size(); k++) {
                    if (triangleNumbers.get(i) + triangleNumbers.get(j) + triangleNumbers.get(k) == number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
