package com.practice;


import java.util.Scanner;

public class NumberPrint {

    public static void main(String[] args) {
//        continue:
        System.out.println("Print The Number:");
        for(int numbers=1; numbers<=22; numbers++)
        {
            if(numbers%5==0){
                continue;
            }
            System.out.print(numbers + "  ");
        }

//        break:
        System.out.println("Please enter a value 20 < n < 100 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n ; i++){
            if(i >20){
                break;
            }
            System.out.print(i + " ");
        }

    }
}
