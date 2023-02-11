import java.util.Scanner;

class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//String s  = sc.nextLine();
		//test(sc.nextLine());

		System.out.println("Plz type day!");
		String res = testTwo(sc.nextLine());
		System.out.println(res);
	}

	static String testTwo(String name) {

		//Latest style
		//Put return infront of switch
		return switch(name){

		case"Mon" , "Tue", "Wed", "Thur", "Fri" -> {
			//More than one line use {} after ->
			System.out.println("Hello ");
			yield "No need to go to JDC";
		}

		case"Sat", "Sun" ->  "Go to JDC";

		default -> "Type int dude!";
		};

		//Must Return like this or default return
		//return null;
	}

	static void test(String name) {

		switch(name){
		case"Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
			System.out.println("No need to go to JDC");
			break;
		case"Saturday", "Sunday":
			System.out.println("Go to Heaven!");
			break;
		}
	}
}

//After java 8, String can be test in switch case
