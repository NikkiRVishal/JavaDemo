package com.practice;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.print("Enter the integer value:");

        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();

//        if(a1 % 2 ==0)
//        {
//            System.out.print(a1+" Even Number");
//        }
//        else
//        {
//            System.out.print(a1+" Odd Number");
//        }
//using ternary operator
        String evenOrodd = (a1 % 2 == 0) ? "Even Number" : "Odd Number";

        System.out.print(a1+" is an " +evenOrodd );
    }
}
