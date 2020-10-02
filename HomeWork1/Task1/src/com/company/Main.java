package com.company;

public class Main {

    public static void main(String[] args) {
        C myObj = new C();
        myObj.getValues();
        System.out.println("Last digit:  " + myObj.getNum1Last());
        System.out.println("First digit: " + myObj.getNum2First());
        System.out.println("Sum of digits: " + myObj.getNum3Sum());
        System.out.println("Multiplication: " + myObj.getFirstAndSecondMultiplication());
        System.out.println("Sum: " + myObj.getThirdAndFifthMultiplication());
    }
}
