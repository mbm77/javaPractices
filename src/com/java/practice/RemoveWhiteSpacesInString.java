package com.java.practice;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String str = "This  is  Javascript  Executor  WebDriver  Interfaces";
		
		String str2 = str.replaceAll("\\s","");
		System.out.println(str2);
	}

}
