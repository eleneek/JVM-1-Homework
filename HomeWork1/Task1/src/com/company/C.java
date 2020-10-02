package com.company;

import java.util.Scanner;

public class C {
    int a,b,c,sum;
    void getValues () {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter first number: ");
            a = input.nextInt();
            System.out.println("Please enter second number: ");
            b = input.nextInt();
            System.out.println("Please enter third number: ");
            c = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter valid numbers");
            getValues();
        }
    }

    int getNum1Last() {
        return a % 10;
    }

    int getNum2First(){
        while (b >= 10)
            b /= 10;
        return b;
    }

    int getNum3Sum(){
        while (c != 0)
        {
            sum = sum + c% 10;
            c = c/10;
        }
        return sum;
    }

    int getFirstAndSecondMultiplication () {
        int ans = getNum1Last() * getNum2First();
        System.out.println("Method 5 answer: " + ans);
        return  ans;
    }

    int getThirdAndFifthMultiplication () {
        int ans =  getNum2First() + getFirstAndSecondMultiplication();
        System.out.println("Method 6 answer: " + ans);
        return  ans;
    }
}
