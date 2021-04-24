/**
 * Test.java
 * CS219. Exception Handling practice (try/catch coding)
 * Jonathan Wheeler
 *
 * If input is of wrong format, or if 0 is provided for divisor,
 * redirect to data entry until valid data is provided.
 */
package Assignment5;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class Test
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    double dividend = 0;
    int divisor = 0;
    String input = "";
    boolean isValid;

    //Get dividend
    //Take string input then parse it to double
    do {
      isValid = true;
      try {
        System.out.print("Enter dividend: ");
        input = stdIn.nextLine(); //nextLine() strips /n from input preventing an infinite loop later
        dividend = Double.parseDouble(input);
      } catch (NumberFormatException nfe) {
        //if we catch an exception set isValid to false, display error message and loop around
        isValid = false;
        //Only display the reason for the exception, not the type of exception
        System.out.println("Invalid Input: (dividend) "  + nfe.getMessage());

      }
    }while(!isValid);

    //get divisor
    //take string input then parse to int
    do {
      isValid = true;
      try {
        System.out.print("Enter divisor: ");
        input = stdIn.nextLine(); //nextLine() strips /n from input preventing an infinite loop later
        divisor = Integer.parseInt(input);
      } catch (NumberFormatException nfe) {
        //if we catch an exception set isValid to false, display error message and loop around
        isValid = false;
        //Only display the reason for the exception, not the type of exception
        System.out.println("Invalid Input: (divisor) " + nfe.getMessage());

      }
      if(divisor == 0) {
        isValid = false;
        System.out.println("input error: divisor can not be zero. Please input again");
      }
    }while(!isValid);

    stdIn.close();

    // process and result
    System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
  } // end main

} // end Test class