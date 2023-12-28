package com.practice;

public class P9Typecasting {
    public static void main(String[] args) {
        double a = 52.24d;
        float b = 56456.5f;
        int i = (int)a;//Explicit Casting: double to integer
        int i1 = (int)b;//Explicit Casting: float to integer

        System.out.println("The Value of Double:" + a);
        System.out.println("The Value of double to integer:" + i);

        System.out.println("The Value of float:" + b);
        System.out.println("The Value of float to integer:" +i1);

        int c = 31235;
        float d = 654545.4541f;
        long l = c;//implicit casting: int to long
        double j = d;//implicit casting: float to double

        System.out.println("The value of integer:" +c);
        System.out.println("The Value of Long to integer:" +l);

        System.out.println("The Value of Float:" +d);
        System.out.print("The value of double to float:" +j);

    }
}
