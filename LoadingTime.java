/**
  * Author  : ARKAR KYAW
  * Created : 13 Jan 2023 Friday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Loading Time
  */

import java.util.Scanner;


public class LoadingTime {
  
  public static void main(String[] args) {

    //Start the program and wait for user input
    System.out.println("Program starting");
    
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    
    //Declaration Class
    LoadDemo demo;
    System.out.println("Declare Class");
    sc.nextLine();
    
    //Create an Object
    demo = new LoadDemo();
    System.out.println("Create Object from Class");
    sc.nextLine();
    
    //Create an Obj Again
    demo = new LoadDemo();
    System.out.println("Create an Obj again!);
    sc.nextLine();
    
    //For Best Practice (-_()_-)
    sc.close(); 
  }
}


class LoadDemo {
  
  //After class declaration finished,
  //Static got works only first time
  static {
    System.out.println("Static Block");
  }
  
  //Instance
  //After static
  {
    System.out.println("Instance Block");
  }
  
  //Constructor
  //After instance
  LoadDemo() {
    System.out.println("Constructor");
  }
}
