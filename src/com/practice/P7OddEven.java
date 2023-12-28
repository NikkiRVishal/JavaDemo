package com.practice;

import java.util.Scanner;

public class P7OddEven {
//    public static void main(String[] args) {
//        int num;
//        System.out.print("Enter the Integer Value:");
//
//        Scanner input = new Scanner(System.in);
//        num= input.nextInt();
//
//        if(num%2==0)
//            System.out.print(num+" is the Even Number.");
//        else
//            System.out.print(num+" is the Odd Number.");
//    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter the Value:");

        Scanner input = new Scanner(System.in);
        num= input.nextInt();
//with ternary operator
        String evenOrodd = (num % 2 == 0) ? "EvenNumber" : "OddNumber";

        System.out.print(num + " is an " + evenOrodd);
    }
}
