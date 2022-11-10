//ARRAYS
//75) Create a program that automatically fills (using logic, not just directly assigning)
// a numeric vector with 15 positions with the first elements of the Fibonacci sequence:
//          1   1   2   3   5   8   13  21  34  55  89  144 233 377 610
//          0   1   2   3   4   5   6   7   8   9   10  11  12  13  14

package Java.Algorithms;

import java.util.Arrays;

public class JavaAlgorithms075 {

    public static void main(String[] args) {

        int [] myArray = new int[15];
        int num1 = 1, num2 = 0;

        myArray[0] = 1;

        for (int i = 1; i < myArray.length; i++) {

                num1 = num1 + num2;
                num2 = num1 - num2;

                myArray[i] = num1;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
