package com.company;
import java.util.Scanner;

public class A {
        int[] numArray = new int[6];
        int firstEl,lastEl,sumOdds = 0, sumEvens = 0;
        int[] fiveRandEls = new int[5];

        void getValues(){
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Enter first number: ");
                firstEl = input.nextInt();
                System.out.println("Enter second number: ");
                lastEl = input.nextInt();
                getRandomValues(numArray,numArray.length,firstEl, lastEl);
            }
            catch (Exception e){
                System.out.println("Please enter valid numbers");
                getValues();
            }
        }

        void getRandomValues(int[] arr,int arrayLength,int first,int last){
            if (last > first){
                System.out.println("Interval is" + first + "-" +last);
                for(int i=0;i<arrayLength;i++){
                    int randomNum = (int) (Math.random() * (last - first +1 )) + first;
                    arr[i] = randomNum;
                }
            }
            else {
                System.out.println("Interval is" + last + "-" +first);
                for(int i=0;i<arrayLength;i++){
                    int randomNum = (int) (Math.random() * (first - last +1 )) + last;
                    arr[i] = randomNum;
                }
            }
            for (int number: arr
            ) {
                System.out.println("Number in array: "+number);
            }
        }

        void countOddAndEvent(){
            int counter = 0;
            for (int number: numArray
            ) {
                if (number % 2 == 1) counter++;
            }
            int even = numArray.length - counter;
            System.out.println("Count of odd numbers: " + counter);
            System.out.println("Count of even numbers : " +  even);
        }

        void getSumOfNums(){
            for (int number:numArray
            ) {
                if (number % 2 == 1) sumOdds += number;
                else sumEvens += number;
            }
            System.out.println("Sum of odds: " + sumOdds);
            System.out.println("Sum of evens: " + sumEvens);
        }

        void generatedRandNums(){
            getRandomValues(fiveRandEls,fiveRandEls.length,sumEvens,sumOdds);
        }
}
