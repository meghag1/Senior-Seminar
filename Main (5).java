// 5 sessions (time slots)
// 5 classrooms (16 people max)
// sessions can't be ran more than twice 
// student may not repeat
// each student must be scheduled for 5 

// create 5 2d array (for each hour)
// horizontal (5 sessions)
// column for name of session and then num of people in it 
// while the number is less than 16 in a sessions, if the person's first choice is this then add them to it

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errorsx
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Seminar s1 = new Seminar();
    s1.loadFile();
    s1.session1();
    s1.session2();
    s1.session3();
    s1.session4();
    s1.session5();
    s1.session6();
    s1.session7();
    s1.session8();
    s1.session9();
    s1.session10();
    s1.session11();
    /*
     * s1.session12();
     * s1.session13();
     * s1.session14();
     * s1.session15();
     * s1.session16();
     * s1.session17();
     * s1.session18();
     */
    s1.SetUp();
  } // close main method
} // close main