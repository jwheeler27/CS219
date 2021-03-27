// StudentRecordManager.java (incomplete)
// CS219 HW1 Project
// (Entry point of the project. Need to use with Student class)
//
// Manages student records using an ArrayList of Student.
// - Load student record data from file in constructor
// - display raw records and some statistics

// java.io classes, used for file i/o
import java.io.File;
import java.io.IOException;

import java.util.Scanner; // I/O methods

import java.util.ArrayList;

public class StudentRecordManager
{

  public static void main(String[] args)
  {
    ArrayList<Student> recList = null;

    // path and file name of data file
    String fileName = "data/cs219.txt";
    // This "cs219.txt" file should already exist in a folder named "data".
    // If using an IDE and source code file is put in a default "src" folder, folder "data" should be at the same location as the "src" folder;
    // otherwise, "data" folder should be at the same location as your .java file


    recList = loadFromFile(fileName);

    displayRecords(recList);

    System.out.println("Number of students: " + recList.size());
    if (recList.size() > 0)
      System.out.printf("Avg AbsenceCount: %.1f%n", avgAbsenceCount(recList));

  } // end main


  // display student records on screen
  private static void displayRecords(ArrayList<Student> records)
  {
    if (records == null || records.size() == 0) // null or empty
    {
      System.out.println("Empty class. No data to show");
      return; // exit method now
    }

    // has some records
    System.out.println("-----------------------------------");
    // LEft justify and right justify the output
    System.out.printf("%-15s %18s %n", "StudentName", "AbsenseCount");

    // for every student record in ArrayList record, print the name and absense count
    for (Student i: records)
    {
      System.out.printf( "%-15s %9s %n", i.getName(), i.getAbsenceCount());
    }

    System.out.println("-----------------------------------");
  } // end displayRecords


  // calculate and return average absence count of all students
  // ADD #2
  private static double avgAbsenceCount(ArrayList<Student> records)
  {
    double absenses = 0;

    for (Student i : records)
    {
      absenses += i.getAbsenceCount();
    }
    return(absenses / records.size());
  }

  // END ADD #2


  // load student data from text files
  /**
     * Fills student record ArrayList with data from text file.
     * columns are separated with comma ,
     *
     * @param fileName  name of input text file
     * @return  number of records loaded
     * @throws IOException: any exception during file opening, reading, and closing
     */
    private static ArrayList<Student> loadFromFile(String fileName)
    {
      Scanner fileIn = null;     // scanner object to connect to file
      ArrayList<Student> records = new ArrayList<>(); // initialize to empty list

      try
      {
        // open input file
        fileIn = new Scanner(new File(fileName));

        // skip first line (headings row)
        fileIn.nextLine(); // read one line, but do not use

        // loop to read multiple records
        while (fileIn.hasNext()) // more lines to read?
        {
          // 1. read one line containing all columns of a record
          String line = fileIn.nextLine();
          if (line.isEmpty())  // empty line: go read next line
            continue;

          // 2. extract name (1st column) and absence count (2nd column)
          // 1st col is name, 2nd col is absence count: xxxx, dd
          String name;
          int absenceCount;

          int toIndex = line.indexOf(',');   // locate first comma ,
          name = line.substring(0, toIndex); // from beginning to the char right before first comma ,

          String absenceCountStr = line.substring(toIndex+1);      // +1 to skip comma ,
          absenceCount = Integer.parseInt(absenceCountStr.trim()); // trim() leading/trailing whitespace

          // 3. create Student object and add to ArrayList records
          records.add(new Student(name, absenceCount));

          // end one record
        }// end while: reading all records

      }
      catch (IOException ioe)
      {
        System.out.println("Error reading \"" + fileName + "\" file: " + ioe);
      }
      finally // close file
      {
        if ( fileIn != null)
        {  // close if was connected to a file
            fileIn.close();
        }
      }
      // end file input

      return records;
  }// end loadFromFile

} // end class StudentRecordManager