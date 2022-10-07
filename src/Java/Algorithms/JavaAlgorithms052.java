//52) Create an algorithm that reads the age of 10 people, showing at the end:
//        a) What is the average age of the group?
//        b) How many people are over 18 years old
//        c) How many people are under 5 years old
//        d) What was the oldest age read

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms052 {

    public static void main(String[] args) {

        int index = 0;
        int over18 = 0;
        int under5 = 0;
        int oldest = 0;
        double sum = 0.0;
        double average = 0.0;

        while (index < 10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert the age: ");
            int age = input.nextInt();

            sum = sum+age;

            if (age >= oldest) {
                oldest = age;
            }
            if (age > 18) {
                over18++;
            }
            if (age < 5) {
                under5++;
            }

            index++;
        }

        average = sum/10;

        System.out.println("a) What is the average age of the group? " + average);
        System.out.println("b) How many people are over 18 years old? " + over18);
        System.out.println("c) How many people are under 5 years old? " + under5);
        System.out.println("d) What was the oldest age read? " + oldest);
    }
}
