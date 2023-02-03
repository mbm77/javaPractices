package practicePrograms;

import java.util.Arrays;

public class StringFunctions3 {

	public static void main(String[] args) {
		String s1 = " Hello ";
		String s2 = "h^e^l^l^o";
		String s3 = "HELLO";
		String s4 = "184";
		System.out.println(s2.indexOf("o"));
		System.out.println(s2.indexOf("y"));
		System.out.println(s2.lastIndexOf("l"));
		
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(0,4));
		
		String[] strArr = s2.split("\\^");
		System.out.println(Arrays.toString(strArr));
		System.out.println(s3.charAt(4));
		//System.out.println(s3.charAt(5));//StringIndexOutOfBoundsException
		
		System.out.println(s3.replace("O", "Z"));
		System.out.println(Integer.valueOf(s4));
		
		int i = 7654656;
		String s5 = String.valueOf(i);
		System.out.println(s5);
		
		String s6;
		String s7 ="";
		String s8 = " ";
		System.out.println(s8.isEmpty());
		System.out.println(s8.isBlank());
		System.out.println(s7.isEmpty());
		System.out.println(s7.isBlank());
	}

}
