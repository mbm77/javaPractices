package practicePrograms;

import java.io.File;
import java.util.Scanner;

//Count the No of words in a text file

public class NumberOfWords {

	public static void main(String[] args) throws Exception {
		int count = 0;
		File file = new File("./test.txt");
		Scanner scanner = new Scanner(file);
		String text = "";
		while(scanner.hasNext()) {
			text += scanner.next()+" ";
			count++;
			text = "";
		}
		System.out.print(text);
		System.out.println(count);
		scanner.close();
		
	}

}
