package com.java.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./test.txt");
		FileInputStream fis = new FileInputStream(file);
		 int asciCode;
		 String text = new String();
		while((asciCode = fis.read()) != -1) {
			text += String.valueOf((char)asciCode);
		}
		System.out.println(text);
		fis.close();
	}

}
