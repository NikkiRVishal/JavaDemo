package com.practice;

import java.util.Scanner;

public class PrimePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number = input.nextInt();

        /*int counter=0;
        for (int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                counter++;
            }
        }//end loop
            if(counter>0)
            {
                System.out.println(number+ " is not Prime Number");
            }else
            {
                System.out.println(number+ " is Prime Number");
            }*/

        for (int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                System.out.println(number+ " is not Prime Number");
                break;
            }
        }//end loop


    }
}
