/*************************************************************************
 * P3_IsEvenOdd.java (shell)
 * Jonathan Wheeler
 * CS219
 * Decides whether all even elements come before odd elements in a given array.
 **************************************************************************/

import java.util.Arrays; // to use Arrays.toString() and Arrays.equals()
    // Arrays is a pre-defined class which contains various methods for
    // manipulating arrays
    // Java API: http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

public class P3_IsEvenOdd
{

  public static void main(String[] args)
  {
    int[] arr1 = new int[]{10, 6, 3, 3};
    boolean expectedResult = true;
    test(arr1, expectedResult);

    int[] arr2 = new int[]{7, 2, 1, -10, 9};
    expectedResult = false;
    test(arr2, expectedResult);

    int[] arr3 = new int[]{9};
    expectedResult = true;
    test(arr3, expectedResult);

    int[] arr4 = new int[]{};
    expectedResult = true;
    test(arr4, expectedResult);
  } // end main

  //**********************************************************************

  // a testing shell to print input array and testing result
  public static void test(int[] nums, boolean expectedResult)
  {
    System.out.println("Testing " + Arrays.toString(nums)); // print content of array
    System.out.println("expected: " + expectedResult); // print expected result
    boolean actualResult = isEvenOdd(nums); // call method that solves the problem
    System.out.println("actual:   " + actualResult); // print result
    System.out.println((expectedResult == actualResult)? "pass" : "fail"); // testing status: pass or fail
    System.out.println(); // empty line between testing cases
  } // end test

  //**********************************************************************

  // actual method that solves the problem
  public static boolean isEvenOdd(int[] nums)
  {
    boolean seenOdd = false;
    // check if we have 1 or less elements in the array
    //empty arrays and single element arrays will always be true
    if (nums.length < 2)
    {
      return true;
    }
    /* for each element in the array:
     *
     * first check to see if it is odd and if it is, set our seenOdd flag to true
     * if it is even, check if we have see and odd number before and if we have
     * return false. Otherwise, return true
     */
    for (int i : nums)
    {
      if (i % 2 == 1)
      {
        seenOdd = true;
      }
      else
      {
        if(seenOdd == true)
        {
          return false;
        }
      }
    }

    return true; // fake return
  } // end isEvenOdd

} // end class P3_IsEvenOdd