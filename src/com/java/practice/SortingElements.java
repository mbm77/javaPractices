package com.java.practice;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		int[] arr = {30,50,10,20,60};
		int[] arr2 = {10,90,3,6,70};
		
		//System.out.println(Arrays.toString(arr));
		//Approach 1
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
		
		//Approach 2
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//sort reverse order
		Integer arr3[] = {1,2,3,4,5};
		Arrays.sort(arr3,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr3));

	}

}
