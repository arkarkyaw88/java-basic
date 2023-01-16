package demo;
//Remember if use package
//Sometimes compile time error got headache
//If u face compileError just cd .. and run javac foldername/FileName.java

public class Child extends Parent {
  
  //Static Code Block
  static {
    System.out.println("Static Block of Child");
  }
  
  //Instance Code Block
  {
    System.out.println("Instance Block of Child");
  }
  
  //Constructor of Child
  public Child() {
    //Firstly automatic invoker
    //super();
    System.out.println("Constructor of Child");
  }
}
