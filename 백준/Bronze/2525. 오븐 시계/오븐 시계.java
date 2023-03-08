import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int needMin = sc.nextInt();

        int minSum = min + needMin;

        int a = (hour * 60) + min;
        int b = a + needMin;

        int h = (b / 60) % 24;
        int m = b % 60;

        System.out.println(h + " " + m);
    }
}
