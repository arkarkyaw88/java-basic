/**
  * Author  : ARKAR KYAW
  * Created : 13 Jan 2023 Friday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Package
  */

//Top Level Code
package hello;

//Declare for public
public class Hello {
 
 //Define a subclass, qualify name SubClass
 hello.sub.SubClass sub = new hello.sub.SubClass();
 
 public void greet() {
   System.out.println("Hello Package");
   //Can invoke subclass sub from here
   sub.greet();
 } 
 
}
