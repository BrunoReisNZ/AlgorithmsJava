//LOOPS WITH FOR
//68) Create a program that reads the sex and weight of 8 people,
// using the “for” structure. At the end, show on the screen:
//a) How many women were registered
//b) How many men weigh more than 100 kg
//c) The average weight among women
//d) The Heaviest weight among men


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms068 {

    public static void main(String[] args) {

        int i = 1;
        double women = 0;
        double sumWomanWeight = 0;
        int men100 = 0;
        double heaviestMan = 0;

        for (i = 1; i <= 8; i++) {

            Scanner input = new Scanner(System.in);
            System.out.print("insert the sex (1 for male, 2 for female): ");
            int sex = input.nextInt();
            System.out.print("insert the weight: ");
            double weight = input.nextDouble();

            if (sex == 2) {
                women++;
                sumWomanWeight = sumWomanWeight + weight;
            }
            if (sex == 1) {
                if (weight >= heaviestMan) {
                    heaviestMan = weight;
                }
                if (weight > 100) {
                    men100++;
                }
            }
        }
        double everage = sumWomanWeight / women;

        System.out.println("a) How many women were registered? " + women);
        System.out.println("b) How many men weigh more than 100 kg? " + men100);
        System.out.println("c) The average weight among women? " + everage);
        System.out.println("d) The Heaviest weight among men? " + heaviestMan);

    }
}
