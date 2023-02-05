//Always Top Level
package package_import_test;

import package_import_test.folderOne.Student;
//For Scanner
import java.util.Scanner;

//For method invoke
import static package_import_test.folderOne.Student.doSomething;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Create an Obj for use another class's method
		Student st = new Student();
		//Invoke
		st.showName();
		//Directly invoked from method
		doSomething();
	}
}

// Run outside from folder path ..
// javac package_import_test/Main.java
// * can use for all package in this folder path.
