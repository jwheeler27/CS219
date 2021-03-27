/*************************************************************************
 * P1_BigDiff.java (shell)
 * Jonathan Wheeler
 * CS219
 * Return the difference between the largest and smallest values in an array.
**************************************************************************/

import java.util.Arrays; // to use Arrays.toString() method
    // Arrays is a pre-defined class which contains various methods for
    // manipulating arrays
    // Java API: http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

public class P1_BigDiff
{

  public static void main(String[] args)
  {
    int[] arr1 = new int[]{10, 6, 3, 3, 5};
    int expectedResult = 7;
    test(arr1, expectedResult);

    int[] arr2 = new int[]{7, -10, 2, 9};
    expectedResult = 19;
    test(arr2, expectedResult);

    int[] arr3 = new int[]{2};
    expectedResult = 0;
    test(arr3, expectedResult);

    int[] arr4 = new int[]{2, 2, 2, 2};
    expectedResult = 0;
    test(arr4, expectedResult);
  } // end main

  //**********************************************************************

  // a testing shell to print input array and testing result
  public static void test(int[] nums, int expectedResult)
  {
    System.out.println("Testing " + Arrays.toString(nums)); // print content of array
    System.out.println("expected: " + expectedResult); // print expected result
    int actualResult = bigDiff(nums); // call method that solves the problem
    System.out.println("actual:   " + actualResult); // print result
    System.out.println((expectedResult == actualResult)? "pass" : "fail"); // testing status: pass or fail
    System.out.println(); // empty line between testing cases
  } // end test

  //**********************************************************************

  // actual method that solves the problem

  // Precondition: array contains at least 1 element
  public static int bigDiff(int[] nums)
  {
    //Set the inital min and max values to whatever the first element in the array is
    int min = nums[0], max = nums[0];

    // for each item in the array, check if it is bigger or smaller
    // than the current max/min and set accordingly
    for( int i : nums) {
      if (i > max) {
        max = i;
      }
      if (i < min)
        min = i;
    }

    return (max - min);
  } // end bigDiff

} // end class P1_BigDiff