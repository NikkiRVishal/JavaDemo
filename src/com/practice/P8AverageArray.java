package com.practice;

import java.util.Scanner;

public class P8AverageArray {
    static int a;
    public static void main(String[] args) {
        a= 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First value:");
        Double num1 = input.nextDouble();

        System.out.print("Enter the Second value:");
        Double num2 = input.nextDouble();

        System.out.print("Enter the Third value:");
        Double num3 = input.nextDouble();
        input.close();
        System.out.print("The Average of entered number is:" + avg(num1, num2, num3));
    }
        public static double avg(double a,double b, double c)
        {
            return (a+b+c / 3);
        }

    }

