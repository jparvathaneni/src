package com.jags;
import java.util.Scanner;

public class Calculator {

    public void calc(){

        System.out.println("Enter a number for your selection:");

        Scanner reader3 = new Scanner(System.in);
        System.out.println(

                "1. Add | 2. Subtract | 3. Divide | 4. Multiply");

        int input = reader3.nextInt();

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");

        int a = reader.nextInt();

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter the second number");

        int b = reader1.nextInt();

        switch (input) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case 3:
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            case 4:
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case 5:
                break;
            default:
                System.out.println("your input is invalid!");
                break;
        }
    }
}