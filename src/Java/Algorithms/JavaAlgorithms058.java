// 58) Write an algorithm that reads the age of several students in a class.
//  The program will stop when age 999 is entered.
//  At the end, show how many students there are in the class and what is the average age of the group.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms058 {

    public static void main(String[] args) {

        int age = 0;
        double sum = 0;
        int count = 0;
        double average = 0;

        while (age != 999) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a age: ");
            age = input.nextInt();
            sum = sum+age;
            count++;
        }
        average = (sum-999)/(count-1);
        System.out.println("Number of students: " + (count-1));
        System.out.println("Average age of the group : " + average);
    }

}
