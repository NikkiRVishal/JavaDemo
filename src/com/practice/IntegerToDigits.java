package com.practice;

public class IntegerToDigits {
    public static void main(String[] args) {
        int num=235;
        int temp= num;
        int[] arr = new int[3];
        System.out.println("Number is: "+ num);
        int i=0;
        while (temp >0){
            arr[i] = temp%10;
            temp = temp/10;
            i++;
        }
        for(int j=2;j>=0;j--) {
            System.out.println(arr[j]);
        }






        int[] array = {10, 20, 30, 40, 50, 10,20};
        int sum = 0;
        //Advanced for loop
        for( int k=0;k<array.length ;k++) {
            sum += array[k];
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}
