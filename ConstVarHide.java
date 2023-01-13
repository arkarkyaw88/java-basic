/**
  * Author  : ARKAR KYAW
  * Created : 13 Jan 2023 Friday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Variable Hiding Situation in Constructor
  */

public class ConstVarHide{

  public static void main(String[] args) {
    
    //Assign
    Hello hello;
    
    //Invoked Constructor with new Object
    //If constructor declare what type,
    //Remember to invoke with type exact
    hello = new Hello(5);
    
    //Invoke method from another class
    hello.greet();
  }
}


class Hello() {
  //Declare variable
  //Global Scope
  int count;
  
  //Constructor with exact type declaration
  //Local Scope
  Hello(int count) {
    //Local count and global count not same
    //In this global to local situation it can be variable hiding.
    //For prevent VarHiding use this.count = count;
    
    this.count = count;
  }
  
  //Method
  void greet() {
    for (int i = 0; i < 3; i++) {
       System.out.println("Hello Java");
    }
  }
}
