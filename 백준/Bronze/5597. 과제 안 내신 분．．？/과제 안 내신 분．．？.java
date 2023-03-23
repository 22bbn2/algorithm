import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // Scanner 객체 생성

//        int N = in.nextInt();
//        int M = in.nextInt();
        int[] basket = new int[31];

        for(int h = 0 ; h < 28 ; h++)
        {
            int N = in.nextInt();
            basket[N] = 1;
        }

        for(int h = 1 ; h < 31 ; h++)
        {
            if(basket[h] != 1) {
                System.out.println(h);
            }
        }

//        for(int z : basket) System.out.print(z+" ");
        // for(int z = 0 ; z < basket.length ; z++)
        // {

        // }
        // {}System.out.println(Arrays.toString(basket));
    }

}