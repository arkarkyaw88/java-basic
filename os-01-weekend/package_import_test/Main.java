//Top Level Code
package package_import_test;

import package_import_test.folderOne.Student;

//For Scanner
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Create an Obj for use another class's method
		Student st = new Student();
		//Invoke
		st.showName();
	}
}

// Run outside from folder path ..
// javac package_import_test/Main.java
