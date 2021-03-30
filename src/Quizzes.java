import java.lang.reflect.Array;
import java.util.*;

public class Quizzes {
    public static void main(String[] args)
    {

        //int[] x = new int[3];
        //System.out.println("x[0] is " + x[0]);



       // int[] y = new int[]{7,2,3,5};
        //test(y);

        double[] z = new double[]{3,7,-2,9};
        test(z);

        int[] arr1 = new int[]{1,3,5};
        int[] arr2 = new int[]{2,8};
        int[] arr3;

        arr3 = append(arr1,arr2);
        System.out.print("Last question: " + arr3.length);
        System.out.print("Last question: " + Arrays.toString(arr3));

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
