package com.jags;

public class MultiplicationTable {

    public void multiplication(int firstnumberI, int lastNumberI){

        System.out.println("arg[0] = " + firstnumberI );
        System.out.println("arg[1] = " + lastNumberI);
          for(int i=1; i <= lastNumberI; i++) {

              //System.out.println(firstnumberI + " * " + i + " = " + firstnumberI*i );
              System.out.println(String.format("%2d %2d %2d", firstnumberI, i, firstnumberI * i));
          }
    }
}
