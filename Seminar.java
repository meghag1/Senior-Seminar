import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;

public class Seminar {
  ArrayList[][] schedule;
  public ArrayList<Student> stuList = new ArrayList<Student>();
  public ArrayList<Student> sess1 = new ArrayList<Student>();
  int count1, count2, count3, count4, count5, count6, count7, count8, count9, count10, count11, count12, count13,
      count14, count15, count16, count17, count18;
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
        stuList.add(new Student(arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]),
            Integer.parseInt(arr[5]), Integer.parseInt(arr[6])));

      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    // System.out.print(stuList);
  } // close load

  public void session1() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 1) {
        sess1.add(kid);
        count1++;

      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session2() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 2) {
        sess2.add(kid);
        count2++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session3() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 3) {
        sess3.add(kid);
        count3++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session4() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 4) {
        sess4.add(kid);
        count4++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session5() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 5) {
        sess5.add(kid);
        count5++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session6() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 6) {
        sess6.add(kid);
        count6++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session7() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 7) {
        sess7.add(kid);
        count7++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session8() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 8) {
        sess8.add(kid);
        count8++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session9() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 9) {
        sess9.add(kid);
        count9++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session10() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 10) {
        sess10.add(kid);
        count10++;
      }
      // System.out.print(sess1 + "\n");

    }

  } // close fsession

  public void session11() {
    for (Student kid : stuList) {
      if (kid.getfirst() == 11) {
        sess11.add(kid);
        count11++;
      }
      // System.out.print(sess1 + "\n");

    }
  }

  public void SetUp() {
    // if the students first choice is this.. add them inot this "cubby"
    // while >16
    int i = 0;
    schedule = new ArrayList[5][5];

    while (i <= 18) {
      for (int s = 0; s < 5; s++) {
        for (int t = 0; t < 5; t++) {
          System.out.print(i + 1 + " ");
          i++;
        }
        System.out.print("\n");
      }
    } // close while

    schedule[0][0] = sess1;
    schedule[1][0] = sess2;
    schedule[2][0] = sess3;
    schedule[3][0] = sess4;
    schedule[4][0] = sess5;
    schedule[0][1] = sess6;
    schedule[1][1] = sess7;
    schedule[2][1] = sess8;
    schedule[3][1] = sess9;
    schedule[4][1] = sess10;
    schedule[0][2] = sess11;
    schedule[1][2] = sess12;
    schedule[2][2] = sess13;
    schedule[3][2] = sess14;
    schedule[4][2] = sess15;
    schedule[0][3] = sess16;
    schedule[1][3] = sess17;
    schedule[2][3] = sess18;

    System.out.print(schedule[1][1]);
  }

  // put the first array list inot the first spot of the array...second into
  // second spot...thrid in third spot...etc

  // create 2d 5x5 aray
} // close seminar
