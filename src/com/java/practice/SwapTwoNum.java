package com.java.practice;

public class SwapTwoNum {

	public static void main(String[] args) {
		
		int a = 10; int b = 20;
		
		/*
		 * int a = 10; int b = 20; int t = a+b; a = t; b = a - b; a = t - b;
		 * 
		 * System.out.println("a = "+a +" b = "+b);
		 */
		
		
		  a = a * b; //200 
		  b = a / b; // 10 
		  a = a / b;
		  
		  System.out.println("a = "+a +" b = "+b);
		 

	}

}
