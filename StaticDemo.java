/**
  * Author  : ARKAR KYAW
  * Created : 10 Jan 2023 Tuesday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Difference between Static & Instance
  */


public class StaticDemo {

	//Instance Variable
	
	String instanceMessage = "Instance Variable";
	
	//int count;

	//Static Variable

	static String messages = "Static Variable";


	public static void main(String[] args) {
		
		// Invoke Static to instance variable cant
		//System.out.println(instanceMessage);

		// Invoke Static Variable is OK
		System.out.println(messages);

		//Can invoke to static method from here
		//hello();

		// Greet is not static method
		// Instance Method can't invoke from Static
		//greet();
		
		//Created Objected first and Invoke to InstanceMethod
		StaticDemo demo = new StaticDemo();
		demo.instanceMethod();
	}	

	//Instance Method
	void instanceMethod() {

		System.out.println("Instance Method");
		
		//Instance Variable
		System.out.println(instanceMessage);

		//Static Variable
		System.out.println(messages);

		//StaticMethod
		hello();

		//InstanceMethod
		greet();
	}

	//Static Method

	static void hello() {
		System.out.println("Hello Static Method");
	}

	//Instance Method

	void greet() {
		System.out.println("Hello Java");
	}
}
