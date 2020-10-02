package com.company;

import java.util.Scanner;

public class A {
    public A() {
       System.out.println("Hello");
    }
    static int x;
    void getValues () {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter X number: ");
            x = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter valid number");
            getValues();
        }
    }

    void methodSecond(){
        int sum = x +12;
        System.out.println("X + 12 sum is: " + sum);
    }

    void  methodThird(){
        String value = x % 2 == 0 ? "Even" : "Odd";
        System.out.println(value);
    }
}


