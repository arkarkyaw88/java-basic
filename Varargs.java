/**
  * Author  : ARKAR KYAW
  * Created : 10 Jan 2023 Tuesday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Variable Arguments
  */


public class Varargs {

	public static void main(String[] args) {
		// Array
		String [] array = {"A", "B", "C"};
		// Method invoking
		show("Hello Bro...", array);
	}
  
  // Varargs 
	
  static void show(String ... values) {
    // For Loop
		for (String str : strs) {
			System.out.println(str);
		}
	}
  
  // Compile Bro :P
  
	static void show(String string, String ... strs) {
		System.out.println("First " + string);
		for (String str : strs) {
			System.out.println(str);
		}
	}
}
