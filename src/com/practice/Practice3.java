package com.practice;

import java.util.Arrays;
import java.util.List;
//for each loop with integer
public class Practice3 {
//    public static void main(String[] args) {
//        List<Integer> Numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
//
//        for (Integer X: Numbers)
//        {
//            System.out.print(X);
//            System.out.print(",");
//        }
//
//    }
//for each loop with String
    public static void main(String[] args) {
        List<String> Names = Arrays.asList("Julie", "Jani", "Jackie","Jasu");

        for (String Name : Names)
        {
            System.out.print(Name);
            System.out.print(",");
        }
    }
}
