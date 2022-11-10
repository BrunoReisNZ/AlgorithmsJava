//ARRAYS
//78) Write a program that reads 15 numbers and stores them in an array.
// At the end, show the entire vector on the screen and then show
// in which positions values that are multiples of 10 were entered.

package Java.Algorithms;

import java.util.Arrays;
import java.util.Random;

public class JavaAlgorithms078 {

    public static void main(String[] args) {

        int[] myArray = new int[15];
        Random random = new Random();
        int upperbound = 100; // generate random values from 0-100

        for (int i = 0; i < myArray.length; i++) {
            int x = random.nextInt(upperbound);
            myArray[i] = x;

            if (x % 10 == 0) {
                System.out.println("The value in position " + i + " is multiple of 10");
            }
        }

        System.out.println(Arrays.toString(myArray));


        }

    }

