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

}
