//ARRAYS
// 73) Create a program that automatically fills (using logic, not just directly assigning)
// a numeric vector with 10 positions, as below:
//          9   8   7   6   5   4   3   2   1   0
//          0   1   2   3   4   5   6   7   8   9


package Java.Algorithms;

import java.util.Arrays;

public class JavaAlgorithms073 {

    public static void main(String[] args) {

        int[] myArray = new int[10];

        for (int i = 0; i< myArray.length; i++) {
            int value = 9;
            myArray[i] = value - i;
        }

        System.out.println(Arrays.toString(myArray));
    }
}
