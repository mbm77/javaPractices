package com.java.practice;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int[] arr = {1,11,12,13,14,15,22,90,17};
		int len = arr.length;
		System.out.println("Even Numbers");
		for(int i=0; i<len; i++) {
			if(arr[i]%2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd Numbers");
		for(int i:arr) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}

}
