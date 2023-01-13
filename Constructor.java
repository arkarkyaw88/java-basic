/**
  * Author  : ARKAR KYAW
  * Created : 13 Jan 2023 Friday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Constructor
  */


public class Constructor {

  public static void main(String[] args) {
    
    //Var assign
    Hello hello;
    
    //Create an object for invoke another methods
    hello = new Hello();
    
    //Assigned ownername dot method can invoke
    hello.greet();
    
  
  }

}

class Hello {
  
  //Constructor
  Hello() {
    System.out.println("Constructor method invoked.");
  }
  
  //Method
  void greet() {
    System.out.println("Hello Java User");
  }
}
