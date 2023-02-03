package com.java.practice;

public class CheckNumPrime {

	public static void main(String[] args) {
		int num =2;
		int count = 0;
		int res;
		if(num > 0) {
			for(int i =1; i<=num; i++) {
				res = num%i;
				
				if(res == 0) {
					count++;
				}
			}
			
			if(count == 2 ) {
				System.out.println("Given number is prime");
			}else {
				System.out.println("Given Number Is Not Prime");
			}
			
		}

	}

}
