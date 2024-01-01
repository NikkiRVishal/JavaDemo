package com.practice;

import java.util.Scanner;

public class VowCon {
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch = input.next().charAt(0);

        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel=true;
        }
        if (isVowel==true)
        {
            System.out.println(ch+" is an Vowel");
        }
        else {
            if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z'))
            {
                System.out.println(ch+" is a Consonant");
            }
            else {
                System.out.println("Input invalid");
            }
        }
    }
}
