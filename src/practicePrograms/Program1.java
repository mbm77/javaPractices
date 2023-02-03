package practicePrograms;

public class Program1 {
	/*
	 * java variables are case sensitive. we should not use reserved words of java
	 * as variable names. java allows $ and _ special chars before variable names.
	 */
	static int a = 10; //global variable
	int birthYear = 1991; // camel-case variable
	
	static String $name = "selenium";
	static float _salary = 45000.00f;

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println($name);
		System.out.println(_salary);
		
		int year = 2023; // local variable
		
		year = year + 30;
		System.out.println(year);
		add();
	}
	
	public static void add() {
		System.out.println(a);
	}

}
