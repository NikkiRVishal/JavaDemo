package com.practice;

import java.util.Scanner;

public class PrintDiamond {
    public static void main(String[] args) {
        int row, column;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Rows Number:");
        int numberofrows = input.nextInt();

        for (row=1; row<=numberofrows; row++)
        {
            //print White Spaces
            for (column=1; column<=numberofrows-row; column++)
            {
                System.out.print(" ");
            }
            for (column=1; column<=row*2-1; column++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
        for (row=numberofrows-1; row>0; row--)
        {
            for (column=1; column<=numberofrows-row; column++)
            {
                System.out.print(" ");
            }
            for (column=1; column<=row*2-1; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
    }

