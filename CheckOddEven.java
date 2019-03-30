// Java program to check odd or even number

import java.util.Scanner;

class CheckOddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ; // Create scanner object

		int input = s.nextInt();
		String result = checkOddEven(input);

		System.out.println(result);
	}


	// Method to check odd or even number
	private static String checkOddEven(int no) {

		if (no == 0) {
			System.out.println("Invalid input. Try inputting not zero value");
			System.exit(1);
		}
		if (no%2 == 0 )
			return "Even";
		else
			return "Odd";
	}
}