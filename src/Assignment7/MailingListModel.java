/*
 * MailingListModel.java (complete)
 * CS219
 *
 * Model class for MVC MailingList GUI program.
 * stores and manages (add/remove) a list of email addresses
 *
 * The Model stores data and performs all the processing.
 * It doesn't know the View exists
 */

// java.io classes, used for file i/o
package Assignment7;

import java.io.BufferedReader;         // file input
import java.io.FileReader;

import java.io.BufferedWriter;         // file output
import java.io.FileWriter;
import java.io.File;

import java.io.IOException;            // any exceptions from file I/O

import java.util.Scanner;              // I/O methods

import java.util.ArrayList;            // ArrayList class

public class MailingListModel
{
  private String fileName;             // name of the file used to store email addresses
  private ArrayList<String> emailList; // list of email addresses
  private boolean hadError;            // true if error/exception detected
  private String statusMsg;            // last status message

  //***************************************************************************************

  // constructor
  public MailingListModel()
  {
    emailList = new ArrayList<String>();
    statusMsg = "no actions";
    hadError = false; // no errors
    fileName = "data/emails.txt";

    loadFromFile(); // load data
  }

  // close down operation: write records to file
  public void closeDown()
  {
    saveToFile();
  }

  // add a record
  public boolean addEmail(String emailAddress)
  {
    String entry = emailAddress.trim().toLowerCase(); // clean up

    if (entry.isEmpty())
    {
      statusMsg = "Failed to add. Please enter an email address";
      hadError = true;  // flag that an error just happened
      return false; // add failed
    }
    else if (emailList.contains(entry)) // record already exists
    {
      statusMsg = "Failed to add. This email address has already been registered";
      hadError = true;  // flag that an error just happened
      return false; // add failed
    }
    else
    {
      statusMsg = "Add succeeded";
      emailList.add(entry);
      return true; // add was successful
    }
  }

  // remove a record
  public boolean removeEmail(String emailAddress)
  {
    String entry = emailAddress.trim().toLowerCase(); // clean up

    if (entry.isEmpty())
    {
      statusMsg = "Failed to remove. Please enter an email address";
      hadError = true;  // flag that an error just happened
      return false; // add failed
    }
    else if (emailList.contains(entry)) // record exists
    {
      statusMsg = "Remove succeeded";
      emailList.remove(entry);
      return true;
    }
    else
    {
      statusMsg = "Failed to remove. This email address is not registered";
      hadError = true;
      return false;
    }
  }

  // retrive error message, if any
  public String getStatusMsg()
  {
    return statusMsg;
  }

  // check if any error
  public boolean getErrorFlag()
  {
    return hadError;
  }

  // retrieve all emails
  public String[] getAllEmails()
  {
    // http://stackoverflow.com/questions/4042434/converting-arrayliststring-to-string-in-java
    return emailList.toArray(new String[0]);
  }

  //***************************************************************************************

  // load email addresses from text file
  private int loadFromFile()
  {
    Scanner fileIn = null;     // scanner object to connect to file

    int recordCount = 0;       // track # of records

    try
    {
      // open input file
      fileIn = new Scanner(new BufferedReader(new FileReader(fileName)));

      // loop through multiple records
      while (fileIn.hasNext())
      {
        // 1. read one email address
        String entry = fileIn.next();

        // 2. add to array list
        emailList.add(entry.trim().toLowerCase());
        recordCount++;
      } // end while loop
    } // end try block
    catch (IOException ioe)
    {
      statusMsg = "Error loading mailing list file: " + ioe.getMessage();
      hadError = true;
    } // end catch block
    finally // close file
    {
      if ( fileIn != null)
      {  // close if was connected to a file
        fileIn.close();
      }
    }
    // end file input

    return recordCount;
  }// end loadFromFile

  //***************************************************************************************

  // write all email addresses to file
  private void saveToFile()
  {
    BufferedWriter writer = null;  // object used to write to file
    try
    {
      File file = new File(fileName); // open file
      writer = new BufferedWriter(new FileWriter(file)); // connect object to file
      for (int i=0; i<emailList.size(); i++)
      {
        writer.write(emailList.get(i)); // write one email address
        writer.newLine(); // write a newline character
      }
    } // end try block
    catch (IOException ioe)
    {
      statusMsg = "Failed to save to mailing list file: " + ioe.getMessage();
      hadError = true;
    } // end catch block
    finally
    { // close writer file
      try
      {
        writer.close();
      }
      catch (IOException ioe)
      {
        statusMsg = "Failed to close mailing list file: " + ioe.getMessage();
        hadError = true;
      }
    } // end finally

  } // end saveToFile

} // end class MailingListModel