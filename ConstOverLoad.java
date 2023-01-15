/**
  * Author  : ARKAR KYAW
  * Created : 15 Jan 2023 Sunday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Constructor Over Load Situation
  */

public class ConstOverLoad {
  
  public static void main(String[] args) {
    
    Hello hello;
    hello = new Hello(5);
    hello.greet();
  }
}


class Hello {
  
  int count;
  
  //Constructor
  Hello() {
    this.count = 1;
  }
  //Constructor with exact type
  Hello(int count) {
    if (count > 0) {
      this.count = count;
    }
  }
  //Instance Method
  void greet() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello Java Method");
    }
  }
}
