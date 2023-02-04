package com.java.practice;

import java.util.Scanner;

public class NumReverse {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int rev = 0;
		
		while(num != 0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		scanner.close();

	}

}
