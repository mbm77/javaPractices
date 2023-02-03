package com.java.practice;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,5};
		int sum = 0;
		for(int i=0; i<arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i=1; i<=5; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		int diff = sum2-sum;
		System.out.println("Missing Element is "+diff);
	}

}
