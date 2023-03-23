import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // Scanner 객체 생성

        int N = in.nextInt();
        int M = in.nextInt();
        int[] basket = new int[N];

        for(int h = 0 ; h < N ; h++)
        {
            basket[h] = h + 1;
        }

        for(int h = 0 ; h < M ; h++)
        {
            int i = in.nextInt() - 1;
            int j = in.nextInt() - 1;

            while (i < j) {
                int temp = basket[i];
                basket[i++] = basket[j];
                basket[j--] = temp;
            }
        }
        for(int z : basket) System.out.print(z+" ");

//        for(int z : basket) System.out.print(z+" ");
        // for(int z = 0 ; z < basket.length ; z++)
        // {

        // }
        // {}System.out.println(Arrays.toString(basket));
    }

}