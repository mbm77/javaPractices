package com.java.practice;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,60,40};
		//int[] arr = new int[5];
		int len = arr.length;
		int sum = 0;
		for(int i=0; i<len; i++) {
			sum = sum + arr[i];
		}
		
		//enhanced for loop
		int sums = 0;
		for(int j:arr) {
			sums = sums+j;
		}
		
		
		System.out.println(sums);

	}

}
