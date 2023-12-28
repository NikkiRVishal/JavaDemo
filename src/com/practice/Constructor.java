package com.practice;

import java.util.concurrent.Callable;
// Constructor EXample
public class Constructor {
    int x;
    String modalName;
    public Constructor(int y, String name)
    {
        x = y;
        modalName=name;
    }

    public static void main(String[] args) {
      Constructor c1 = new Constructor(45,"Alia Bhatt");
      System.out.println(c1.x +" "+ c1.modalName);
    }
}
