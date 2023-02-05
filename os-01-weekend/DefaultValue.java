class DefaultValue {


	static int iValue;
	static double dValue;
	static char cValue;
	static boolean boolValue;

	public static void main(String[] args) {
		// In this situation, local variable must initialize
		// int localInt;

		// System.out.println(iValue);
		// System.out.println(localInt);

		System.out.println("Result :" + (getInt() + getDouble()));
	}

	// static long add(double num1, double num2) {
	// 	long result;

	// 	result = num1 + num2;
	// 	return result;
	// }

	// Error situation
	// static long add(double num1, double num2) {
	// 	return = num1 + num2;
	// }

	static int getInt() {
		System.out.println("getInt()");
		return 10;
	}

	static double getDouble() {
		System.out.println("getDouble()");
		return 10;
	}
}
