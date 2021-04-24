/**
 * Test2java
 * CS219. Exception Handling practice (defensive coding)
 * Jonathan Wheeler
 *
 * If input is of wrong format, or if 0 is provided for divisor,
 * redirect to data entry until valid data is provided.
 */
package Assignment5;

import java.util.Scanner;

public class Test2
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    double dividend = 0;
    int divisor = 0;
    //String input = "";
    boolean isValid;

    //Get dividend
    //Check to see if we get a valid input, if not, loop around
    do {
      isValid = true;
      System.out.print("Enter dividend: ");
      if (stdIn.hasNextDouble()) {
        dividend = stdIn.nextDouble();
      }
      else {
        isValid = false;
        stdIn.next();
        System.out.println("Invalid input.");
      }
    }while(!isValid);

    //get divisor
    //Check for valid input and if divisor equals zero
    do {
      isValid = true;
      System.out.print("Enter divisor: ");
      if (stdIn.hasNextInt()) {
        divisor = stdIn.nextInt();
      }
      else {
        isValid = false;
        stdIn.next();
        System.out.println("Invalid input.");
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