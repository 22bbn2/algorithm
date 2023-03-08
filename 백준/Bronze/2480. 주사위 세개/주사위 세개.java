import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans;

        if(a == b & b == c){
            ans = 10000+a*1000;
        }
        else if(a == b || a == c){
            ans = 1000+a*100;
        }
        else if(b == c){
            ans = 1000+b*100;
        }
        else{
            ans = (Math.max(Math.max(a, b), c)) * 100;
        }

        System.out.println(ans);
    }
}
