package practicePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//no of lines in a text file
public class NumberOfLines {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./test.txt");
		Scanner scanner = new Scanner(file);
		int count = 0;
		String text = new String();
		while(scanner.hasNextLine()) {
			text += scanner.nextLine() + "\n";
			count++;
			text= "";
		}
		System.out.println(count);
		System.out.println(text);
		scanner.close();

	}

}
