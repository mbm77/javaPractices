package com.java.practice;

public class SumOfDigits {

	public static void main(String[] args) {
		int numDel = 0;
		int sum =0;
		int num = 1208;
		while(num > 0) {
			numDel = num%10;
			sum =sum+numDel;
		num = num/10;
		}
		System.out.println(sum);
	}

}
