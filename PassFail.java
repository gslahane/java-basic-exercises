class PassFail {
	public static void main(String[] args) {

		int marks = 3;

		String result = checkPassFail(marks);

		System.out.println(result);

	}

	// Checking pass or fail
	static String checkPassFail(int marks) {
		if (marks < 35)
			return "Fail";
		else if (marks > 35)
			return "Pass";
		else 
			return "Done!"

	}
}