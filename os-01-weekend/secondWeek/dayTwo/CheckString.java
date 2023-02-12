public class CheckString {
	// "[", "]", "{", "}", "(", ")", ""
	// "[]", "{}", "()",
	// "[] {} ()"
	// "[(){}]", "[({})]"
	public static boolean isBalance(String string) {
		
		//Split to charArray
		char [] array = string.toCharArray();
		//To save isOpen in blank array
		char [] opens = {};

		for(char c : array) {

			//Check char open or close situation
			//if else return type boolean
			if(isOpen(c)) {
				//Put new open Char to opens Array
				opens = push(c, opens);
			} else {

				//If there is no open for target close char
				if(opens.length == 0) {
					return false;
				}

				//Array of last char length from opens
				char open = opens[opens.length - 1];
				if(!match(open, c)) {
					return false;
				}

				opens = removeLast(opens);
			}
		}

		return opens.length == 0;

	}

	private static char [] removeLast(char [] array) {
		// Care about char [] value is zero
		// We want last value of last minus one
		char [] result = new char[array.length - 1];

		for (var i = 0; i < array.length-1; i++) {
			result[i] = array[i];
		}
		return result;
	}

	private static boolean match(char open, char close) {
		return (open == '[' && close == ']')
			|| (open == '{' && close == '}')
			|| (open == '(' && close == ')');
	}

	//Push Method
	private static char[] push(char c, char [] array) {
		//Original char array to +1 and save to result array
		char [] result = new char[array.length+1];

		//Old array 
		for(var i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		result[result.length - 1] = c;
		return result;
	}

	//Method of if isOpen
	private static boolean isOpen(char c) {
		return c == '[' || c == '{' || c == '(';
	}
}
