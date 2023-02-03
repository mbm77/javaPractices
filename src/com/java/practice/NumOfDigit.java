package com.java.practice;

import java.util.Scanner;

public class NumOfDigit {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count=0;
		while(num !=0 ) {
			num = num/10;
			count++;
		}
		System.out.println(count);

	}

}
