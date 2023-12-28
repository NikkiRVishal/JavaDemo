package com.practice;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name, Age, Salary:");

        String str = input.nextLine();
        int age = input.nextInt();
        double sal = input.nextDouble();

        input.close();
        System.out.println("Name:" +str);
        System.out.println("Age:" +age);
        System.out.println("Salary:" +sal);
    }
}
