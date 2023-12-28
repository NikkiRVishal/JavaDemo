package com.practice;

public class ForEach {

    public static void main(String[] args) {
        Integer[] arr = {11, 23, 45, 62, 90};
        //general for loop
//        for(Integer i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //For Each loop
        for(Integer x : arr){
            System.out.println(x);
        }


    }
}
