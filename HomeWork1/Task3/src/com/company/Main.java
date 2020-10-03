package com.company;

public class Main {

    public static void main(String[] args) {
        A myObj = new A();
        myObj.getValues();
        myObj.countOddAndEvent();
        myObj.getSumOfNums();
        myObj.getRandomValues(myObj.fiveRandEls,myObj.fiveRandEls.length,myObj.sumEvens,myObj.sumOdds);
    }
}
