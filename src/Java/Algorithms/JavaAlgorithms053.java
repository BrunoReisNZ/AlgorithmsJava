//53) Make a program that reads the age and sex of 5 people, showing at the end:
//        a) How many men were registered
//        b) How many women were registered
//        c) The mean age of the group
//        d) The average age of men
//        e) How many women are over 20 years old?

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms053 {

    public static void main(String[] args) {

        int index = 0;
        int men = 0;
        int women = 0;
        int womenOver20 = 0;
        double groupSum = 0.0;
        double groupAverage;
        double menSum = 0.0;
        double menAverage;

        while (index < 5) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert the age: ");
            int age = input.nextInt();
            System.out.print("Insert 1 for male, 2 for female: ");
            int sex = input.nextInt();

            groupSum = groupSum+age;


            if (sex == 1) {
                men++;
                menSum = menSum+age;
            }
            if (sex == 2) {
                women++;
            }
            if (sex == 2 && age > 20) {
                womenOver20++;
            }

            index++;
        }
        groupAverage = groupSum/5;
        menAverage = menSum/men;

        System.out.println("a) How many men were registered? " +  men);
        System.out.println("b) How many women were registered? " + women);
        System.out.println("c) The everage age of the group? " + groupAverage);
        System.out.println("d) The average age of mens? " + menAverage);
        System.out.println("e) How many women are over 20 years old? " + womenOver20);

    }
}
