//59) Create a program that reads the sex and age of several people.
// The program will ask each person whether or not the user wants to continue. In the end, show:
//a) what is the highest age read
//b) how many men were registered
//c) how old is the youngest woman
//d) what is the average age among men

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms059 {

    public static void main(String[] args) {

        int highestAge = 0;
        int men = 0;
        double sumManAge = 0;
        double averageManAge;
        int youngestWoman = 999;
        boolean whantToContinue = true;

        while (whantToContinue) {
            Scanner input = new Scanner(System.in);
            System.out.println("Insert Gender:");
            System.out.println("[1] Male");
            System.out.println("[2] Female");
            System.out.print("Answer: ");
            int gender = input.nextInt();
            System.out.print("Insert Age: ");
            int age = input.nextInt();

            if (age >= highestAge) {
                highestAge = age;
            }

            if (gender == 1) {
                men++;
                sumManAge = sumManAge+age;
            } else if (gender == 2) {
                if (age <= youngestWoman) {
                    youngestWoman = age;
                }
            }
            System.out.println("Do you want to continue? ");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            System.out.print("Answer: ");
            int yesOrNo = input.nextInt();

            if (yesOrNo == 2) {
                whantToContinue = false;
            }

        }
        averageManAge = sumManAge / men;
        System.out.println("a) what is the highest age read? " + highestAge);
        System.out.println("b) how many men were registered? " + men);
        System.out.println("c) how old is the youngest woman? " + youngestWoman);
        System.out.println("d) what is the average age among men? " + averageManAge);
    }

}
