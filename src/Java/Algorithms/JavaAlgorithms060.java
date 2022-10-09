//60) Develop an algorithm that reads the name, age and gender of multiple people.
// The program will ask if the user wants to continue or not. In the end, show:
//a) The name of the oldest person
//b) The name of the youngest woman
//c) The everage age of the group
//d) How many men are over 30 years old?
//e) How many women are under the age of 18?

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms060 {

    public static void main(String[] args) {

        String nameOfHighestAge = "";
        String nameOfYoungestWoman = "";
        int highestAge = 0;
        int men = 0;
        int woman = 0;
        double sum = 0;
        double average;
        int youngestWoman = 999;
        int count = 1;
        boolean whantToContinue = true;

        while (whantToContinue) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert Name: ");
            String name = input.nextLine();
            System.out.print("Insert Age: ");
            int age = input.nextInt();
            System.out.println("Insert Gender:");
            System.out.println("[1] Male");
            System.out.println("[2] Female");
            System.out.print("Answer: ");
            int gender = input.nextInt();

            sum = sum+age;

            if (age >= highestAge) {
                highestAge=age;
                nameOfHighestAge = name;//a) The name of the oldest person
            }

            if (gender == 1 && age > 30) {
                men++;//d) How many men are over 30 years old?
            } else if (gender == 2) {
                if (age < 18) {
                    woman++;//e) How many women are under the age of 18?
                }
                if (age <= youngestWoman) {
                    youngestWoman=age;
                    nameOfYoungestWoman = name;//b) The name of the youngest woman
                }
            }
            System.out.println("Do you want to continue? ");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            System.out.print("Answer: ");
            int yesOrNo = input.nextInt();

            if (yesOrNo == 1) {
                count++;
            } else if (yesOrNo == 2) {
                whantToContinue = false;

            }

        }
        average = sum / count;//c) The everage age of the group

        System.out.println("a) The name of the oldest person? " + nameOfHighestAge);
        System.out.println("b) The name of the youngest woman? " + nameOfYoungestWoman);
        System.out.println("c) The everage age of the group? " + average);
        System.out.println("d) How many men are over 30 years old? " + men);
        System.out.println("e) How many women are under the age of 18? " + woman);

    }
}
