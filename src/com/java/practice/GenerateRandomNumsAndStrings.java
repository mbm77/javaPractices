package com.java.practice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumsAndStrings {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int rand_num = rand.nextInt(1000); //0 to 999 random integer number
		
		double rand_dbl = rand.nextDouble(); //0.0 to 1.0 random decimal number
		
		double rand_dbl2 = Math.random();
		//System.out.println(rand_num); 
		
		//Apache commons-lang API
		//https://commons.apache.org/
		
		//for random numbers
		String randNum = RandomStringUtils.randomNumeric(10);
		
		//for random strings
		String randStr = RandomStringUtils.randomAlphabetic(10);
		
		System.out.println(randStr);
	}

}
