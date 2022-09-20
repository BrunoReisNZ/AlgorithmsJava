//18) Make a program that reads the year of birth of a person,
// calculate her age and then show whether or not she can vote.


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms018 {
    public static void checkIfCanVote (int currentYear, int dateOfBirth){
        int age = currentYear - dateOfBirth;
        System.out.println("The minimum age for vote is 18");
        if (age < 18) {
            System.out.println("Your age is: " + age);
            System.out.println("You can't vote");
        } else {
            System.out.println("Your age is: " + age);
            System.out.println("You can vote");        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Current Year: ");
        int currentYear = input.nextInt();
        System.out.print("Date of Birth: ");
        int dateOfBirth = input.nextInt();

        checkIfCanVote(currentYear, dateOfBirth);
    }
}
