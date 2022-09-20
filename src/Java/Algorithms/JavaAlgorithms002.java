//2) Write a program that reads a person's name and displays a welcome message.
//        welcome to her:
//        Ex:
//        What is your name? John Doe
//        Hi John Doe, nice to meet you!

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms002 {
    public static void main(String[] args) {

        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hi " + name + ", nice to meet you!");

    }
}