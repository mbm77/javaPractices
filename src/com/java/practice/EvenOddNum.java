package com.java.practice;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		int numDel = 0;
		while(num > 0) {
			numDel = numDel%10;
			if(num%2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num = num/10;
		}
		
		System.out.println("Even: "+evenCount+ " Odd :"+oddCount);
		scanner.close();
	}

}
