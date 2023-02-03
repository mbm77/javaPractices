package com.java.practice;

public class RemoveJunk {

	public static void main(String[] args) {
		String str ="@string bqrdqxkulbvnqizjpal(double qvrvcaglzv,    bool obeyhpxhvjeuid@^";
		String str2 = str.replaceAll("[^a-zA-Z0-9\\s]", "");
		String str3 = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(str3);
	}

}
