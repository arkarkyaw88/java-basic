/**
  * Author  : ARKAR KYAW
  * Created : 13 Jan 2023 Friday
  * Master  : Min Lwin ( JDC )
  * Class   : Java Basic Online Class
  * Define  : Code Block
  */

import java.util.Properties;
import java.io.FileInputStream;


public class CodeBlock {
  
  public static void main(String[] args) {
    
    Hello hello = new Hello();
    hello.show();
  }
}

class Hello {
  
  //Declaration instance variables
  String name;
  int count;
  
  //Codeblock for init instance variable
  {
    try(FileInputStream input = new FileInputStream("settings.properties")) {
      
      Properties prop = new Properties();
      prop.load(input);
      
      name = prop.getProperty("name");
      count = Integer.valueOf(prop.getProperty("count"));
    } catch(Exception e) {
        e.printStackTrace();
    }
  }
  void show() {
    for (int i = 0; i < count; i++) {
    System.out.println(name);
    }
  }
}
