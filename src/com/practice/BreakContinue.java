package com.practice;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner sc;
        int n;

        while(true){
            System.out.println("Please enter a number, Enter 50 to exit:");
           sc = new Scanner(System.in);
           n = sc.nextInt();
           if(n==50) {
               break;
           }
           if(n%2==0) {
               continue;
           }
           System.out.println(n);
        }
    }
}
