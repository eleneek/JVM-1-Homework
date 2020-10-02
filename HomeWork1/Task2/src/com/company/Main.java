package com.company;

public class Main {

    public static void main(String[] args) {
	    A myObj = new A();
	    myObj.getValues();
	    myObj.methodSecond();
	    myObj.methodThird();
	    B secObj = new B();
		secObj.inputValue();
		System.out.println("Sum of two elements is: " + secObj.getSum() );
    }
}
