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
            basket[h] = h+1;
        }

        for(int h = 0 ; h < M ; h++)
        {
            int i = in.nextInt();
            int j = in.nextInt();

            int temp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = temp;
        }

        for(int z : basket) System.out.print(z+" ");


//        for(int z : basket) System.out.print(z+" ");
        // for(int z = 0 ; z < basket.length ; z++)
        // {

        // }
        // {}System.out.println(Arrays.toString(basket));
    }

}