package com.jdc.demo.service;

package com.jdc.demo.utils.IdGenerator;

package com.jdc.demo.dto.Student;


public class StudentRegistry {
  
  //Declare Variable
  private IdGenerator idGen;
  
  //Delcare array variable
  private Student [] array;
  
  //Constructor
  public StudentRegistry() {
    //Create new obj for idGen
    idGen = new IdGenerator();
    //
    array = new Student[0];
  }
  
  // For Add new student method n passed to s
  // Generate id for student
  public Student addNew(Student s) {
    
    var id = idGen.generate();
    
    s.setId(id);
    //Method invoked
    pushToArray(s);
    
    return s;
    
  }
  
  //Find by ID
  public Student findById(int id) {
     for (var s : array) {
      if (s.getId() == id) {
        return s;
        }
     }
    return null;
  }
  
  //Copy n Push to Array 
  private void pushToArray(Student s) {
    var copy = new Student[array.length + 1];
    
    for (var i = 0; i < array.length; i ++) {
      copy[i] = array[i]
    }
  }
}
