package com.company;

import java.util.Scanner;

public class B extends A {
    int y;
    void inputValue () {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter Y number: ");
            y = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter valid number");
            getValues();
        }
    }

    int getSum(){
        return  x + y;
    }
}
