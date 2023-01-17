package demo;

public class Parent {
  
  static {
    System.out.println("Static Block of Parent");
  }
  
  {
    System.out.println("Instance Block of Parent");
  }
  
  public Parent() {
    System.out.println("Constructor of Parent");
  }
}
