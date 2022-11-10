//ARRAYS
//71) Write a program that automatically fills a numeric array with 8
//        positions as below:
//          999 999 999`999 999 999 999 999
//          0   1   2   3   4   5   6   7

package Java.Algorithms;

import java.util.Arrays;

public class JavaAlgorithms071 {

    public static void main(String[] args) {


        int[] myArr = new int[8];

        for (int i = 0; i < myArr.length; i++) {

            myArr[i] = 999;

      //Arrays.fill(myArr, 999); can be used like this!


        }
        System.out.println(Arrays.toString(myArr));

    }
}
