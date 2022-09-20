//20) Develop a program that reads an integer and shows whether it is even or odd.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms020 {

    public static void checkIfEvenOrOdd (int number) {
        if (number % 2 == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insert a number: ");
        int number = input.nextInt();

        checkIfEvenOrOdd(number);
    }
}