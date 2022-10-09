//BASIC SEQUENCES
//4) Develop an algorithm that reads two integers and displays the sum
//        between them.
//        Ex:
//        Enter a value: 8
//        Enter another value: 5
//        The sum of 8 and 5 equals 13.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " equals : " + (num1 + num2));

    }
}
