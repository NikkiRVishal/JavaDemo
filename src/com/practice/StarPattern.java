package com.practice;

public class StarPattern {
    public static void main(String[] args) {
        int row, column, numberofrows=10;
//        for (row=0;row<=numberofrows;row++)
//        {
//            for (column=0;column<=row;column++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (row=0;row<numberofrows;row++)
        {
            for (column=2*(numberofrows-row);column>2;column--)
            {
                System.out.print(" ");
            }
            for (column=0;column<=row;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
