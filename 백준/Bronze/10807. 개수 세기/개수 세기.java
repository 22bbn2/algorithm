import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] cnt = new int[count];
        int find;
        int findCnt = 0;

        for(int i = 0 ; i < count ; i++)
        {
            cnt[i] = sc.nextInt();
        }

        find = sc.nextInt();

        for(int i = 0 ; i < count ; i++)
        {
            if(cnt[i] == find)
            {
                findCnt++;
            }
        }

        System.out.println(findCnt);
    }
}