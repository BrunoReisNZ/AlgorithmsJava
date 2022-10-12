//LOOPS WITH DO WHILE
//63) Create a program using the “do while” structure that reads multiple numbers.
//
// At each loop, ask if the user wants to continue or not. At the end, show on the screen:
//a) The sum of all the values
//b) What was the smallest value entered
//c) The average of all values
//d) How many values are even?

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms063 {

    public static void main(String[] args) {

        double number = 0;
        int anotherOne = 1;
        double smallesValue = 999;
        double even = 0;
        double sum = 0;
        int count = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert a number: ");
            number = input.nextDouble();
            System.out.print("Do you want to insert another one? 1 for yes, 2 for no ");
            anotherOne= input.nextInt();

            count++;
            sum=sum+number;

            if (number < smallesValue) {
                smallesValue = number;
            }
            if (number%2 == 0) {
                even++;
            }

        } while (anotherOne == 1);

        double everage = sum / count;

        if (anotherOne == 2) {
            System.out.println("***************************************************");
            System.out.println("a) The sum of all the values?" + sum);
            System.out.println("b) What was the smallest value entered? " + smallesValue);
            System.out.println("c) The average of all values? " + everage);
            System.out.println("d) How many values are even?? " + even);

        }
    }
}
