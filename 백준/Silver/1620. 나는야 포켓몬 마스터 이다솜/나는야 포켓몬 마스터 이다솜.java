
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
    
        // 키 문자열 조합이 필요하기때문에 해쉬맵 생성
        HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
        String[] nameArr = new String[n + 1];

        // 입력
        for(int i = 1; i < n + 1; i++) {
            String name = br.readLine();
            nameMap.put(name, i);
            nameArr[i] = name;
        }

        while(m --> 0) {
            String findStr = br.readLine();
            if(isNum(findStr)) { // 숫자를 입력받은 경우
                int index = Integer.parseInt(findStr);
                System.out.println(nameArr[index]);
            }
            else {	// 문자를 입력받은 경우
                System.out.println(nameMap.get(findStr));
            }
        }
    }
    
    public static boolean isNum(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}