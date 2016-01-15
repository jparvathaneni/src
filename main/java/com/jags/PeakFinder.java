package com.jags;

/**
 * Created by Jagadeesh on 11/21/2015.
 */
public class PeakFinder {

    public static void main(String[] args) {

        PeakFinder pf = new PeakFinder();
        pf.pkFinder();
        printPeak(pf);
    }

    private static void printPeak(PeakFinder pf) {
        int[] retPeak = pf.pkFinder();
        for (int i=0; i<retPeak.length; i++) {
            if (!(retPeak[i] == 0))
                System.out.println("Peak Number is: " + retPeak[i]);
        }
    }

    public int[] pkFinder(){
        int[] arr = new int[]{10,4,6,4,14,4,5,1};
        int[] peak = new int[20];
        int tempPeak = 0;

        for (int ind = 0; ind < arr.length-2; ind++) {
            if((arr[ind] <= arr[ind+1]) && (arr[ind+1] >= arr[ind+2])){
                peak[tempPeak] = arr[ind+1];
                tempPeak++;
            }
        }
        return peak;
    }
}
