package com.practice;

import java.util.Scanner;

public class CharAT {
    public static void main(String[] args) {
        //String str= "Hello";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = input.nextLine();

        //using charAt() method
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            input.close();
            System.out.println("Character at " + i + " Position: " + ch);
        }
    }
}
