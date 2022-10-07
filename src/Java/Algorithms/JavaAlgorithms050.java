//50) Develop a program that draws 20 numbers between 0 and 10 and displays on the screen:
//        a) What were the numbers drawn?
//        b) How many numbers are above 5
//        c) How many numbers are divisible by 3

package Java.Algorithms;

import java.util.Random;
import java.util.Scanner;

public class JavaAlgorithms050 {

    public static void main(String[] args) {

        int index = 0;
        int above5 = 0;
        int divisibleBy3 = 0;

        System.out.print("a) ");

        while (index < 20) {
            Random rand = new Random();
            int randomNum = rand.nextInt((10) + 1);
            index++;
                if (randomNum > 5) {
                    above5++;
                } if (randomNum%3 == 0 && randomNum !=0) {
                    divisibleBy3++;
                }
            System.out.print(randomNum + " ");

        }
            System.out.println("\nb) " + above5 + " ");
            System.out.println("c) " + divisibleBy3 + " ");
    }
}
