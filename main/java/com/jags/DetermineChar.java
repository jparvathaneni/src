package com.jags;

public class DetermineChar {

    public void testChar(String str) {
    char c = str.charAt(0);
       if(!Character.isLetter(c)){
           System.out.println("This is a number");
       }

    }
}
