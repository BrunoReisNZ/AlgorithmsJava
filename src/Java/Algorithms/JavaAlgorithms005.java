//5) Make a program that reads a student's two grades in a subject and shows
//        your average in the subject on the screen.
//        Ex:
//        Grade 1: 4.5
//        Grade 2: 8.5
//        The average between 4.5 and 8.5 is equal to 6.5


package Java.Algorithms;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JavaAlgorithms005 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insert grade 1: ");
        double grade1 = input.nextDouble();
        System.out.print("Insert grade 2: ");
        double grade2 = input.nextDouble();

        System.out.println("The average between " + grade1 + " and " + grade2 + " is equal to " + (grade1 + grade2)/2);

    }
}
