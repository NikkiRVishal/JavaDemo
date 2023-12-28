package com.practice;

public class MethodCheck {

    public static void main(String[] args) {
        int i=2, j=5;
        int result  = add(i, j);
        System.out.println(result);
    }

    private static int add(int i, int j) {
        int c = i+ j;
        return c;
    }

}
