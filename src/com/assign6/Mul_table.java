package com.assign6;



public class Mul_table {
	public static void multable(int no) {
		
		
		for(int x=1;x<=10;x++) {
		System.out.println( no+ "*" +x + "=" + (no*x));
		}
	}	
		public static void main(String[] args) {
			Mul_table mul = new Mul_table();
			Mul_table.multable(5);
		}
}
