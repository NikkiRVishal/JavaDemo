package com.practice;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        int row, column;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number:");
        int numberofrows = input.nextInt();

        for (row=0; row<numberofrows; row++)
        {
            for (column=0; column<=row; column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
