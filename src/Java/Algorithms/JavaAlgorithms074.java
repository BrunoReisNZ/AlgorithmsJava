//ARRAYS
//74) Create a program that automatically fills (using logic, not just directly assigning)
// a numeric vector with 10 positions, as below:
//          5   3   5   3   5   3   5   3   5   3
//          0   1   2   3   4   5   6   7   8   9


package Java.Algorithms;

import java.util.Arrays;

public class JavaAlgorithms074 {
    public static void main(String[] args) {

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                myArray[i] = 5;
            } else {
                myArray[i] = 3;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}