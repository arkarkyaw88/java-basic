public class CheckStringTest {

	public static void main(String[] args) {
		
		//This situation is we want
		//If Open and Close must be same in level
		test("[]", true);
		test("[}", true);
		test("[]{}", true);
		test("[()]", true);
		test("[(){}]", true);
		test("[()", false);
		test("[(]", false);
	}

	//Method
	//Want to test those strings,
	//We want is expected value.
	//That's why putted in args
	static void test(String str, boolean expected) {

		//Execute Test Method
		boolean result = CheckString.isBalance(str);

		//Check Result
		System.out.printf(
			"Input: \"%-8s\", Expected: %-6s, Result: %-6s (%s)%n",
			str, expected, result, (expected == result) ? "OK" : "NG"
		);
	}
}
