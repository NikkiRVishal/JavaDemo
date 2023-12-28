package com.practice;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Addnum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Number1:");
        int num1 = input.nextInt();

        System.out.println("Enter the value of Number2:");
        int num2 = input.nextInt();
        input.close();

        int sum= num1 + num2;

        System.out.println("The sum of these two Number:" +sum);

    }
}
