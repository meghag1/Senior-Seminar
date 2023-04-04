import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;

public class Seminar{
  Student[][] schedule;
public ArrayList<Student> stuList = new ArrayList<Student>();
public ArrayList<Student> sess1 = new ArrayList<Student>();
public ArrayList<Student> sess2 = new ArrayList<Student>();
public ArrayList<Student> sess3 = new ArrayList<Student>();
public ArrayList<Student> sess4 = new ArrayList<Student>();
public ArrayList<Student> sess5 = new ArrayList<Student>();
public ArrayList<Student> sess6 = new ArrayList<Student>();
public ArrayList<Student> sess7 = new ArrayList<Student>();
public ArrayList<Student> sess8 = new ArrayList<Student>();
public ArrayList<Student> sess9 = new ArrayList<Student>();
public ArrayList<Student> sess10 = new ArrayList<Student>();
public ArrayList<Student> sess11 = new ArrayList<Student>();
public ArrayList<Student> sess12 = new ArrayList<Student>();
public ArrayList<Student> sess13 = new ArrayList<Student>();
public ArrayList<Student> sess14 = new ArrayList<Student>();
public ArrayList<Student> sess15 = new ArrayList<Student>();
public ArrayList<Student> sess16 = new ArrayList<Student>();
public ArrayList<Student> sess17 = new ArrayList<Student>();
public ArrayList<Student> sess18 = new ArrayList<Student>();

  
public void loadFile() {
    try {
      File myObj = new File("Students.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arr = data.split(",");
        // creates arr with data
        stuList.add(new Student(arr[1], Integer.parseInt(arr[2]), Integer.parseInt.(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])));

      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

 // System.out.print(stuList);
  } // close load

  public void fsession() {
    for (Student kid: stuList) {
      System.out.print(kid.getfirst());
      if(kid.getfirst().contains(" 1")) {
        System.out.print(kid);
        sess1.add(kid);
      }
      //System.out.print(sess1 + "\n");
    }
    
  } // close fsession

  
} // close seminar