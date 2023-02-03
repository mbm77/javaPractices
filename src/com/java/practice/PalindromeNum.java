package com.java.practice;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int org_num = num;

		int rev = 0;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(org_num == rev) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("given number is not palindrome");
		}
	}

}
