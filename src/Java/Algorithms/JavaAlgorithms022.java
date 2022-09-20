//22) Write a program that reads the year of a boy's birth and shows his situation regarding military enlistment.
//        - If he is under the age of 18, show how many years are left for the enlistment.
//        - If he is above 18, show how many years have passed since enlistment.

package Java.Algorithms;

import java.util.Scanner;
import java.time.LocalDate;

public class JavaAlgorithms022 {

    public static void checkForMilitaryDraft (int currentYear, int dateOfBirth){
        int age = currentYear - dateOfBirth;
        System.out.println("You have to inslist in military draft by the age of 18");
        System.out.println("Your age is: " + age);

        if (age < 18) {
            System.out.println("You have " + (18-age) + " year left until your military draft");
        } else if (age == 18) {
            System.out.println("Your have to inlist in military draft this year");
        } else {
            System.out.println("You have passed " + (age-18) + " year since your military draft");
        }
    }

    public static void main(String[] args) {
        //Getting the current date value of the system
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        Scanner input = new Scanner(System.in);
        System.out.print("Date of Birth: ");
        int dateOfBirth = input.nextInt();

        checkForMilitaryDraft(currentYear, dateOfBirth);

    }
}

