package practicePrograms;

public class MinimumMaximum {

	public static void main(String[] args) {
		int[] arr = {12,1234,8,36,56, 2023};
		int arrLength = arr.length; 
		System.out.println("Minimum Value : "+ getMin(arrLength, arr));
		System.out.println("Maximum value : "+ getMax(arrLength, arr));

	}

	public static int getMin(int len, int[] arr) {
		int res = arr[0];
		for(int i=1; i<arr.length; i++) {
			res = Math.min(res, arr[i]);
		}
		return res;

	}

	public static int getMax(int arrLength, int[] arr) {
		int res = arr[0];

		for(int i=1; i<arrLength; i++) {
			res = Math.max(res, arr[i]);
		}
		return res;
	}

}
