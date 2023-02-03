package practicePrograms;

public class StringFunctions {

	public static void main(String[] args) {
		String s1 = "HeLlo";
		String s2 = "hello";
		String s3 = "HELLO";
		String s4 = new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s4));
		System.out.println(s2==s4);
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.endsWith("Lo"));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("llo"));
	}

}
