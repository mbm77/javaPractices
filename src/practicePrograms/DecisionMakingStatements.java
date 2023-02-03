package practicePrograms;

public class DecisionMakingStatements {

	public static void main(String[] args) {
		int securedMarks = 30;
		int cutOffMarks = 35;
		if(securedMarks > cutOffMarks ) {
			System.out.println("Eligible");
		}else if(securedMarks == cutOffMarks) {
			System.out.println("Waiting List");
		}else {
			System.out.println("In-Eleigible");
		}

	}

}
