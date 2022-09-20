//6) Write a program that reads an integer and displays its predecessor and its
//        successor.
//        Ex:
//        Enter a number: 9
//        The predecessor of 9 is 8
//        The successor of 9 is 10


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms006 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The predecessor of " + number + " is " + (number - 1) + ".");
        System.out.println("The successor of " + number + " is " + (number + 1) + ".");
    }
}
