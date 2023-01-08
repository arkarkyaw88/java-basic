/**
  * Author  : ARKAR KYAW
  * Created : 8 Jan 2023 Sunday
  * Master  : ( JDC ) Sir Min Lwin
  * Class   : Java Basic Online Class
  * Define  : Variable Scopes
  */

public class ScopeDemo {

	public static void main(String[] args) {

		//Invoking
		
		Demo demo = new Demo();
		demo.doSomething("Hello");
	}
}
 
/**
 *  Class
 * 
 */

class Demo {


	//Constructor - Second Working
	Demo() {
		System.out.println("Constructor : Body : " + body);
	}

	//Method - Third Working
	//In Method there is no [] 
	void doSomething(String args) {

		System.out.println("Method : Body : " + body);

		//For Loop

		for( int i = 0; i < 10; i ++) {
			System.out.println("For Loop : Body : " + body + i);
		}
	}

	int body = 1;

	{	
		String name = "Block Variable Code";
		//Code Block - First Working
		System.out.println("Code Block : Body : " + body + name);
	}
}
