//ARRAYS
// 72) Create a program that automatically fills (using logic, not just directly assigning)
// a numeric vector with 10 positions, as below:
//          5   10  15  20  25  30  35  40  45  50
//          0   1   2   3   4   5   6   7   8   9

package Java.Algorithms;

import java.util.Arrays;

public class JavaAlgorithms072 {

    public static void main(String[] args) {

        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (i+1)*5;
        }
        System.out.println(Arrays.toString(myArr));

    }
}
