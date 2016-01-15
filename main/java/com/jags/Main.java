package com.jags;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");
        //String firstNumber = args[0];
       // String lastNumber = args[1];
        //int firstnumberI = Integer.parseInt(firstNumber);
       // int lastNumberI = Integer.parseInt(lastNumber);

        MultiplicationTable mt = new MultiplicationTable();
        //mt.multiplication(firstnumberI,lastNumberI);

        DetermineChar dc = new DetermineChar();
        //dc.testChar(firstNumber);

        Calculator cal = new Calculator();
        cal.calc();

    }
}