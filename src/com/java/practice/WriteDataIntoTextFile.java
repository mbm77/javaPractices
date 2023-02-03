package com.java.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./test2.txt");
		FileWriter fw = new FileWriter(file);
		String str = "Hellow World";
		fw.write(str);
		fw.write(str);
		fw.write(str);
		fw.close();
	}

}
