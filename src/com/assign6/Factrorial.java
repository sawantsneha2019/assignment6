package com.assign6;

public class Factrorial {
	public int factrorial(int no) {
		int fact=1;
		for(int x=1;x<=no;x++){
			fact=fact*x;
		}
	return fact;
	}
	
	public static void main(String[] args) {
		Factrorial facto =new Factrorial();
		
		int result =facto.factrorial(5);     //hear we not call non static method hear using class name 
		System.out.println("factrial total given number is" +result );
		
	}
}
