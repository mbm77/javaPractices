package practicePrograms;

public class ExceptionHandlings {

	public static void main(String[] args) {
		method2();

	}
	
	public static void method2() {
		method1();
	}
	
	public static void method1() {
		System.out.println("Execution starts here");
		int fNumber = 9;
		int sNumber = 0;
		int result = 0;
		
		try {
			result = fNumber/sNumber;
		}catch(ArithmeticException ae) {
			System.out.println(ae.toString()); // write a logic to enter this message into log file.
			throw ae;
		}finally {
			System.out.println("finally block");
		}
		
		
		System.out.println("Output is :"+ result);
		System.out.println("Exrcution ends here");
	}

}
