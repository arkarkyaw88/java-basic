/**
  * Author  : ARKAR KYAW
  * Created : 13 Jan 2023 Friday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Package invoking
  */


public class PackageDemo {
  
  public static void main(String[] args) {
    
    //If u want to invoke other package from here
    //Use their packageName dot class
    //Create an object first and invoke
    hello.Hello hello = new hello.Hello();
    hello.greet();
  }
}
