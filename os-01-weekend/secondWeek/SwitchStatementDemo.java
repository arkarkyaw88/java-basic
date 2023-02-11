import java.util.Scanner;

class SwitchStatementDemo {

	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);

		showGreeting("Welcome from JDC");
		//Accept int value with res
		int res = askItems(sc);
		//
		showOutput(res);
		showGreeting("Saronara Dude");
		

	}

	// showGreeting
	private static void showGreeting(String str) {
		System.out.println("============================");
		System.out.println();

		System.out.println(str);

		System.out.println();
		System.out.println("============================");

	}

	// askItems 
	private static int askItems(Scanner sc) {

		//Multiline String
		System.out.println(""" 
			Plz select One by number !
			1. Orange
			2. Apple
			3. Mango
			4. Pineapple
			5. Watermelon

			""");
		// Scanner's Input must be int type
		int num = sc.nextInt();
		return num;
	}

	// showOutput
	private static void showOutput(int i) {

		//LocalVar
		String name = "";

		//Condition Switch
		switch(i){
		case 1:
			name = "Orange";
			break;
		case 2:
			name = "Apple";
			break;
		case 3:
			name = "Mango";
			break;
		case 4:
			name = "Pineapple";
			break;
		case 5:
			name = "Watermelon";
			break;
		default:
			break;
		}

		System.out.println("Product name : " + name);
	}

}
