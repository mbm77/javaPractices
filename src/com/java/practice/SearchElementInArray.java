package com.java.practice;

public class SearchElementInArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,20};
		int val = 20;
		int count = 0;
		String eleInd = "";
		int len = arr.length;
		for(int i=0; i<len; i++) {
			if(val == arr[i]) {
				eleInd += i +" "; 
				
				count++;
			}
		}
		if(count > 0) {
			System.out.println("Element is found "+count+" times at "+ eleInd);
		}else {
			System.out.println("Element is not found");
		}
	}

}
