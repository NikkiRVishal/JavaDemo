package com.practice;

import java.util.Scanner;

public class Multiplyoftwonumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number1:");
        int n1 = input.nextInt();
        System.out.print("Enter the Number2:");
        int n2 = input.nextInt();

        int mul = n1*n2;

        input.close();
        System.out.print("Multiplication Value:" +mul);
    }
}
