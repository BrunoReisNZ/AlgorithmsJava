//LOOPS WITH FOR
//67) Write a program using the “for” structure that reads a
// positive integer and displays a count from 0 to the entered value on the screen:
//Ex: Enter a value: 9
//Count: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, END!

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms067 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("insert a positive number: ");
        int number = input.nextInt();
        int i = 0;

        System.out.print("Count: " );
        for (i = 0; i<=number; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("END");
    }
}
