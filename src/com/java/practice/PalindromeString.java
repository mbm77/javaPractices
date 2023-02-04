package com.java.practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		String org_str = str;
		String rev="";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(org_str)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
		scanner.close();
	}

}
