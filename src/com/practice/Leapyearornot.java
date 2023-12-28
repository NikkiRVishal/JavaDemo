package com.practice;

import java.util.Scanner;

public class Leapyearornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year,to check leap year or not:");
        int year = input.nextInt();

        boolean isLeap = false;

        if(year % 4 ==0)
        {
            if(year % 100 ==0)
            {
                if(year % 400 ==0)
                {
                    isLeap = true;
                }else {
                    isLeap = false;
                }
            }else {
                isLeap = true;
            }
        }else {
            isLeap = false;
        }
        if(isLeap==true)
        {
            System.out.println(year + " This is Leap Year");
        }
        else {
            System.out.println(year + " This is not Leap Year");
        }
    }
}
