class CheckString {
  
  // "[", "]", "{", "}", "(", ")", ""
  // "{}", "[]", "()"
  // "[] {} ()"
  // " [(){}] ", " [({})] ",
  
  public static boolean isBalance(String str) {
    
    char [] array = string.toCharArray();
    
    Stack opens = new Stack();
    
    for (char c : array) {
      
      if (isOpen(c)) {
        opens.push(c);
      }else {
        
        char open = opens.pop();
        if(!match(open,c )) {
          return false;
        }
      }
    }
    
    return opens.isEmpty();
  }
  
  private static char [] removeLast(char [] array) {
  
    char [] result = new char[array.length - 1];
    
    for (var i = 0; i < array.length-1; i++) {
      result[i] = array[i];
    }
    return result;
  }
  
  private static boolean match(char open, char close) {
    return ( open == '[' && close == ']' ) 
      || ( open == '{' && close == '}' )
      || ( open == '(' && close == ')' )
      
  }
  
  //
  private static char[] push(char c, char [] array) {
    
    char [] result = new char[array.lenght+1];
    
    for (var i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    result[result.lenght - 1] = c;
    return result;
  }
  
  private static boolean isOpen(char c) {
    return c == '[' || c == '{' || c == '(';
  }
  
  
}
