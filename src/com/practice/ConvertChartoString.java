package com.practice;

import java.util.Scanner;

public class ConvertChartoString {
    public static void main(String[] args) {
       char ch='n';

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Character:");
//        char ch = input.toString();

        String str = Character.toString(ch);
        System.out.println("String is: "+str);

        String str2 = String.valueOf(ch);
        System.out.println("String is: "+str2);
    }
}
