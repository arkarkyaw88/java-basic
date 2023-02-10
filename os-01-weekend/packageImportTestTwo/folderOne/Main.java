//Main
package packageImportTestTwo.folderOne;

import packageImportTestTwo.folderTwo.Data;
import packageImportTestTwo.folderThree.Utils;

public class Main {
  
  public static void main(String [] args) {
    
    Data d = new Data();
    d.showData(5);
    
    Utils u = new Utils();
    u.printData("HaXor Arkar Kyaw");
  
  }

}
