class Person {

	// Global Variable 
	// Can invoke from anywhere inside class
	String name;
	static int age;
	int data = 222;

	// Local Method camelCase , Behaviour
	void testLocal() {

		//LocalVariable can invoke inside of block
		//VariableHiding situation
		int count = 19;
		data = 23;

		System.out.println(count);
	}

	//VariableHiding situation
	void testLocalTwo(int data) {
		
		System.out.println(data);
	}

	// Method , Behavior
	// void show() {

	// 	name = "Ar Kar";
	// 	age = 25;
	// 	data = 55;

	// 	System.out.println(name);

	// 	name = "Su Su";
	// 	System.out.println(name);

	// 	System.out.println(age);
	// 	System.out.println(data);
	// }
}%                           
