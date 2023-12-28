package com.practice;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //logic to find prime
        int counter = 0;
        for(int i=2;i<=num/2;i++){
            if(num%i == 0) {
                counter++;
                break;
            }
        }
        if(counter>0) {
            System.out.println(num + " is not a prime number");
        }else{
            System.out.println(num + " is a prime number");
        }
    }
}
