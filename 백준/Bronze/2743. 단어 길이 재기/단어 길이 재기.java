import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        String ans = scanner.nextLine();

        // 입력 받은 변수의 길이 출력
        int length = ans.length();
        System.out.println(length);

        // Scanner 닫기 (관례적으로 사용이 끝나면 닫아주는 것이 좋습니다)
        scanner.close();
    }
}
