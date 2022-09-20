//26) Write an algorithm that reads two integers and compares them, showing on the screen one of the messages below:
//- The first value is the highest
//- The second value is the highest
//- There is no greater value, both are equal

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms026 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insert the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Insert the second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The first number is the highest");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second number is the highest");
        } else {
            System.out.println("There is no greater value, both are equal.");
        }
    }
}
