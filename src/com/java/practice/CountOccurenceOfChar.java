package com.java.practice;

public class CountOccurenceOfChar {

	public static void main(String[] args) {
		String str  = "This is java progarm";
		int len = str.length();
		int len2 = str.replace("i", "").length();
		
		int diff = len - len2;
		System.out.println("The occurance of a is "+ diff);

	}

}
