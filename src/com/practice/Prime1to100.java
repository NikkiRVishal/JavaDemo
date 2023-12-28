package com.practice;

public class Prime1to100 {
    public static void main(String[] args) {
        int counter = 0;
        for (int k = 1; k <= 100; k++) {
            for (int i = 2; i <= k / 2; i++) {
                if (k % i == 0) {
                    counter++;
                    break;
                }
            }//(int i = 2; i <= num / 2; i++)
            if (counter > 0) {
                System.out.println(k + " is not a prime number");
            } else {
                System.out.println(k + " is a prime number");
            }
            counter = 0;
        }//end for (int k = 1; k <= 100; k++)

    }
}
