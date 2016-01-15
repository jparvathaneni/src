package com.jags;

import java.util.Scanner;
/**
 * Created by Jagadeesh on 11/22/2015.
 */
public class FibFinder {

    public static void main(String[] args) {

        FibFinder ff = new FibFinder();
        ff.fib();
        fibPrint(ff);
    }

    private static void fibPrint(FibFinder ff) {

        int[] prtFibonacci = new int[ff.fib().length];

        for (int prtIndex=0; prtIndex<prtFibonacci.length; prtIndex++){
            System.out.println(prtFibonacci[prtIndex]);
        }
    }

    public int[] fib(){

        Scanner fibLengthReader = new Scanner(System.in);

        System.out.println("Enter the number of fibonacci numbers needed: ");
        int fibLength = fibLengthReader.nextInt();

        int[] fibonacci = new int[fibLength];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int prtFibIndex=2; prtFibIndex<fibLength-2; prtFibIndex++){
            fibonacci[prtFibIndex] = fibonacci[prtFibIndex-1] + fibonacci[prtFibIndex - 2];
        }
return fibonacci;
    }
}
