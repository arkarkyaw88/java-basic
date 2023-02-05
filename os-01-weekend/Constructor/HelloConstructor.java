public class HelloConstructor {

	public static void main(String[] args) {
		
		//Create an obj when Construct will run 1st time
		//Object creation time auto run, Use Constructor
		Student st = new Student();

	}
}


class Student {
  //Constructor
	Student() {
		System.out.println("Hello Student ");
	}
}
