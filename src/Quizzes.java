import java.lang.reflect.Array;
import java.util.*;

public class Quizzes {
    public static void main(String[] args)
    {

        int[][] x = new int[4][3];
        for (int row = 0; row < x.length; row++)
            for (int col = 0; col < x[0].length; col++)
                if (row < col)
                    x[row][col] = 10;
                else if (row == col)
                    x[row][col] = 5;
                else
                    x[row][col] = 20;


            for (int[] row : x)

                // converting each row as string
                // and then printing in a separate line
                System.out.println(Arrays.toString(row));

            System.out.println(x.length);

    }

    /*
    public static void test(int[] nums)
    {
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i] > nums[i-1])
                nums[i] *= 2;
        }
        System.out.println(Arrays.toString(nums));

        //return nums;
    }
*/
    public static void test(double[] nums)
    {
        for (int i=0; i<nums.length-1; i++)
        {
            int index = i;
            for (int j=i+1; j<nums.length; j++)
                if (nums[index] < nums[j])
                    index = j;
            // process
            double tmp = nums[index];
            nums[index] = nums[i];
            nums[i] = tmp;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static int[] append(int[] arr1, int[] arr2)
    {
        int[] tempArr = new int[arr1.length+arr2.length];

        for (int i=0; i<arr1.length; i++) {
            tempArr[i] = arr1[i];
        }

        for (int i = 3; i < tempArr.length; i++)
        {
            tempArr[i] = arr2[i-3];
        }

        return (tempArr);

    } // end append
}
