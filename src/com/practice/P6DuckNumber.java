package com.practice;

import java.util.Scanner;

public class P6DuckNumber {

    public static boolean checkDuckNumber(int num){
        while (num != 0)
        {
            if(num % 10==0)
                return true;
            num = num/10;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Positive Number:");
        n = scan.nextInt();

        if(checkDuckNumber(n))
        {
            System.out.print(n+ "is a Duck Number.");
        }
        else {
            System.out.print(n+ "is not a Duck Number.");
        }
    }
}
