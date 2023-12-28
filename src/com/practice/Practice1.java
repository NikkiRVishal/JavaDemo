package com.practice;

public class Practice1 {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        for (int x: numbers)//for loop
        {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.println("\n");

        String [] name= {"James", "Robert", "Jani", "Jacky", "Rani"};
        for (String names: name)
        {
            System.out.print(names);
            System.out.print(",");
        }
    }
}
