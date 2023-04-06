class Student {

  public String email;
  public String name;
  public int first, second, third, fourth, fifth;

  public Student(String name, int firstchoice, int secondchoice, int thirdchoice, int fourthchoice, int fifthchoice) {
    this.name = name;
    first = firstchoice;
    second = secondchoice;
    third = thirdchoice;
    fourth = fourthchoice;
    fifth = fifthchoice;

  } // close student obj

  public String getname() {
    return name;
  }

  public int getfirst() {
    return first;
  }

  public int getsecond() {
    return second;
  }

  public int getthird() {
    return third;
  }

  public int getfourth() {
    return fourth;
  }

  public int getfifth() {
    return fifth;
  }

  public String toString() {
    return (name + "\n");
  }

} // close student