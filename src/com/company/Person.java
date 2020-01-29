package com.company;

public class Person {

    public int height=200;
    public String name = "default";

    public void say (String name) {
        System.out.println("hello "+ name);
    }

    public   Person (int h, String n) {
        height = h;
        name = n;
    }
    public   Person (String n) {
      name = n;
    }
    public   Person () {

    }

}
