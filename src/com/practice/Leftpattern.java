package com.practice;

import jdk.internal.platform.SystemMetrics;

public class Leftpattern {
    public static void main(String[] args) {
//        for (int i=0;i<=3;i++){
//            for(int j=3;j>=i;j--){
//                System.out.print(i + "" + j+ " ");
//            }
//            System.out.println("");
//        }
//
//        System.out.println("");

        for (int i=0;i<=3;i++){
            for(int j=2*(4 - i);j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(i + "" + k + " ");
            }
            System.out.println("");
        }
    }
}
