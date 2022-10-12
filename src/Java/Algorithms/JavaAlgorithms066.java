//LOOPS WITH FOR
//66) Write a program that reads any number and displays the multiplication table for that number.
//number, using the “for” structure.
//Ex: Enter a value: 5
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15...

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms066 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        int i = 1;

        for (i = 1; i<=10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}
