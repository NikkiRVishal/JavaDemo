package com.practice;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {


        int a;
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        //if else
       /* if(a%2 == 0){
           System.out.println("Even");
        }else {
            System.out.println("Odd");
        }*/

//        Terenary operator
        /*String result = a%2 ==0? "Even": "Odd";
        System.out.println(result);*/

//        Switch case
        int r = a%2;

        switch(r){
            case 0:
                System.out.println("Even"+ a) ;break;
            default:
                System.out.println("Odd" + a) ;break;
        }

    }

}
