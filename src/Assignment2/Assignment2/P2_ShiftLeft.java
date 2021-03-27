/*************************************************************************
 * P2_ShiftLeft.java (shell)
 * Jonathan Wheeler
 * CS219
 * Return an array that is �left shifted� by one position.
 **************************************************************************/

import java.util.Arrays; // to use Arrays.toString() and Arrays.equals()
    // Arrays is a pre-defined class which contains various methods for
    // manipulating arrays
    // Java API: http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

public class P2_ShiftLeft
{

  public static void main(String[] args)
  {
    int[] arr1 = new int[]{6, 2, 3, 1, 2};
    int[] expectedResult1 = new int[]{2, 3, 1, 2, 6};
    test(arr1, expectedResult1);

    int[] arr2 = new int[]{1, 2};
    int[] expectedResult2 = new int[]{2, 1};
    test(arr2, expectedResult2);

    int[] arr3 = new int[]{8};
    int[] expectedResult3 = new int[]{8};
    test(arr3, expectedResult3);

  } // end main

  //**********************************************************************

  // a testing shell to print input array and testing result
  public static void test(int[] nums, int[] expectedResult)
  {
    System.out.println("Testing " + Arrays.toString(nums)); // print content of array
    System.out.println("expected: " + Arrays.toString(expectedResult)); // print expected result
    int[] actualResult = shiftLeft(nums); // call method that solves the problem
    System.out.println("actual:   " + Arrays.toString(actualResult)); // print result
    System.out.println((Arrays.equals(expectedResult, actualResult))? "pass" : "fail"); // testing status: pass or fail
    System.out.println(); // empty line between testing cases
  } // end test

  //**********************************************************************

  // actual method that solves the problem
  public static int[] shiftLeft(int[] nums)
  {
    //get the first element of the array
    int first = nums[0];

    //MAke sure our array has more than 1 element
    if(nums.length != 1) {
      //move each element left 1
      for (int i = 1; i < nums.length; i++) {
        nums[i - 1] = nums[i];
      }
      //Set the last element to the original first
      nums[nums.length-1] = first;
    }
    return nums; // fake return
  } // end shiftLeft

} // end class P2_ShiftLeft