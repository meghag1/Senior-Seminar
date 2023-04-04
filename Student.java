class Student {

  public String email;
  public String name;
  public String first, second, third, fourth, fifth;

  public Student(String name, String firstchoice, String secondchoice, String thirdchoice, String fourthchoice, String fifthchoice) {
    this.name = name;
    first = firstchoice;
    second = secondchoice;
    third = thirdchoice;
    fourth = fourthchoice;
    fifth = fifthchoice;
    
    
  } // close student obj 

   public String getfirst() {
    return first;
  }

  public String toString() {
    return(name + "\n");
  }
  
} // close student