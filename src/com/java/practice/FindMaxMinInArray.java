package com.java.practice;

public class FindMaxMinInArray {

	public static void main(String[] args) {
		//int[] arr = {3,7,1,600,4,5};
		/*
		 * int res = arr[0]; int res2 = arr[0]; int len = arr.length;
		 * 
		 * for(int i=1; i<len; i++) { res = Math.min(res, arr[i]); }
		 * System.out.println("Min value :"+res); for(int i=1; i<len; i++) { res2 =
		 * Math.max(res2, arr[i]); } System.out.println("Max Value "+res2);
		 */
		int[] arr = {3,7,1,600,4,5};
		int max = arr[0];
		int min = arr[0];
		int arrLen = arr.length;
		for(int i=1; i<arrLen; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Mximum value : "+max);
		
		for(int i=1; i<arrLen; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Value "+min);
	}

}
