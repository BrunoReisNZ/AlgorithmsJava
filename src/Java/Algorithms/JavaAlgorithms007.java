//BASIC SEQUENCES
//7) Create an algorithm that reads a real number and displays its double and its third part.
//        Ex:
//        Enter a number: 3.5
//        Twice 3.5 is 7.0
//        The third part of 3.5 is 1.16666

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms007 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double twice = number*2;
        double thirdPart = number/3;

        System.out.println("Twice of " + number + " is " + twice);
        System.out.println("Third Part of " + number + " is " + thirdPart);

    }
}
