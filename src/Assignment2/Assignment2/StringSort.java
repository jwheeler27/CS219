/****************************************************
 * StringSort.java
 * Jonathan Wheeler
 *
 * CS219
 *
 * Use a selection sort to sort an array of strings.
 * Modified professors test code to print out the
 * results of my sort and determine if it worked.
 ***************************************************/

import java.util.Arrays;

public class StringSort {

    public static void main(String[] args)
    {
        String[] arr1 = new String[]{"one", "two", "three"};
        String[] expectedResult = new String[]{"one", "three", "two"};
        test(arr1, expectedResult);

        String[] arr2 = new String[]{"four", "FOUR", "eight", "EIGHT"};
        String[] expectedResult2 = new String[]{"EIGHT", "FOUR", "eight", "four"};
        test(arr2, expectedResult2);

        String[] arr3 = new String[]{"s", "si", "sit", "sippy", "situation"};
        String[] expectedResult3 = new String[]{"s", "si", "sippy", "sit", "situation"};
        test(arr3, expectedResult3);
    }

    public static void test(String[] words, String[] expectedResult)
    {
        System.out.println("Testing " + Arrays.toString(words)); // print content of array
        System.out.println("expected: " + Arrays.toString(expectedResult)); // print expected result
        String[] actualResult = sort(words); // call method that solves the problem
        System.out.println("actual:   " + Arrays.toString(actualResult)); // print result
        System.out.println((Arrays.equals(expectedResult, actualResult)? "pass" : "fail")); // testing status: pass or fail
        System.out.println(); // empty line between testing cases
    } // end test

    public static String[] sort(String[] words)
    {
        //variable to temporarily hold the word we want to swap
        String tempWord;

        //Selection sort
        //split array into sorted and unsorted parts
        //initially the sorted part is zero elements
        for (int i = 0; i < words.length-1; i++) {

            //find the index of the smallest String
            int min = i;
            for (int j = i + 1; j < words.length; j++) {
                if(words[j].compareTo(words[min]) < 0)
                {
                    min = j;
                }
            }
            //Swap elements with the current index of the sorted part
            tempWord = words[i];
            words[i] = words[min];
            words[min] = tempWord;
        }
        return words;
    }
}
