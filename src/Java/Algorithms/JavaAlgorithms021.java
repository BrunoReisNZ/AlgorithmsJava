//21) Make an algorithm that reads a given year and shows whether or not it is a leap year.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms021 {
    public static void checkIfLeapYear (int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("It's not a leap year");
        } else {
            System.out.println("It's a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert a year: ");
        int year = input.nextInt();
        checkIfLeapYear (year);
     }
}
