package com.practice;

import java.util.Scanner;

public class Nonintegerno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Number1:");
        double d1 = input.nextDouble();

        System.out.print("Enter the value of Number2:");
        double d2 = input.nextDouble();
        input.close();

        double d3 = d1 + d2;

        System.out.print("The addition of "+d1+" and "+d2+" is:" +d3);




    }
}
