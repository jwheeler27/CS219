package Discussion;

import java.util.Arrays;

public class Unit3 {

    public static void main(String[] args)
    {
        //General test case
        int[][] arr1 = new int[][]{{1,2,3,4},{4,3,2,1},{9,8,7,6},{6,7,8,9}};
        int expectedResults = 2;
        test(arr1, 0, expectedResults);

        //General invalid column test case
        int[][] arr2 = new int[][]{{1,2,3,4},{4,3,2,1},{9,8,7,6},{6,7,8,9}};
        expectedResults = -1;
        test(arr2, 5, expectedResults);

        //jagged array valid column test case
        int[][] arr3 = new int[][]{{8,0,-2},{12, 34, 9, -7},{2},{1,2,3,4}};
        expectedResults = 1;
        test(arr3, 0, expectedResults);

        //jagged array invalid column test case
        int[][] arr4 = new int[][]{{8,0,-2},{12, 34, 9, -7},{2},{1,2,3,4}};
        expectedResults = -1;
        test(arr4, 4, expectedResults);
    }

    public static void test(int[][] arr, int col, int expectedResults)
    {
        System.out.println("Testing " + Arrays.deepToString(arr)); // print content of array
        System.out.println("expected: " + expectedResults); // print expected result
        int actualResult = findRowOFColMax(arr, col); // call method that solves the problem
        System.out.println("actual:   " + actualResult); // print result
        System.out.println((expectedResults == actualResult)? "pass" : "fail"); // testing status: pass or fail
        if(actualResult == -1)
        {
            System.out.println("The column value " + col + " is invalid");
        }
        else {
            System.out.println("The largest element in column " + col + " is " +
                    arr[actualResult][col] + " from row " + actualResult);
        }
            System.out.println(); // empty line between testing cases
    }

    public static int findRowOFColMax(int[][] arr2d, int col)
    {
        //set our index and max to 0
        int max=0;
        int index = 0;

        /* First check the length of each row to make sure
         * we have a valid number of columns.
         *
         * If we do, find the max element and record its
         * index number
         *
         * IMPROVEMENT IDEA: Make it work with jagged arrays
         */
        for(int i = 0; i < arr2d.length; i++)
        {

            if(arr2d[i].length < col) {
                return -1;
            }
            if(arr2d[i][col] > max)
            {
                index = i;
                max = arr2d[i][col];
            }
        }

        return index;
    }
}
