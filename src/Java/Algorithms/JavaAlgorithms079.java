//79) Develop a program that reads 10 integers and stores them in an array.
// At the end, show which even numbers were entered and where they are stored.

package Java.Algorithms;

import java.util.Arrays;
import java.util.Random;

public class JavaAlgorithms079 {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        Random random = new Random();
        int upperbound = 100; // generate random values from 0-100

        for (int i = 0; i < myArray.length; i++) {
            int x = random.nextInt(upperbound);
            myArray[i] = x;

            if (x % 2 == 0) {
                System.out.println("The value in position " + i + " is even");
            }
        }

        System.out.println(Arrays.toString(myArray));


    }
}
