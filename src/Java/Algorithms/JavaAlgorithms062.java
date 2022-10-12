//LOOPS WITH DO WHILE
//Make a program using the “do while” structure that reads the ages of several people.
// At each loop, you should ask the user whether or not he wants to continue typing data.
// At the end, when the user decides to stop, show on the screen:
//a) How many ages were entered
//b) What is the average between the ages entered
//c) How many people are 21 years old or older.

package Java.Algorithms;

import java.util.Objects;
import java.util.Scanner;

public class JavaAlgorithms062 {

    public static void main(String[] args) {

        int numberOfPeople = 0;
        int anotherOne = 1;
        int moreThan21 = 0;
        double sumAge = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert age: ");
            double age = input.nextDouble();
            System.out.print("Do you want to insert another one? 1 for yes, 2 for no ");
            anotherOne= input.nextInt();

            numberOfPeople++;
            sumAge=sumAge+age;

            if (age>=21) {
                moreThan21++;
            }

        } while (anotherOne == 1);

        double everage = sumAge / numberOfPeople;

        if (anotherOne == 2) {
            System.out.println("***************************************************");
            System.out.println("a) How many ages were entered? " + numberOfPeople);
            System.out.println("b) What is the average between the ages entered? " + everage);
            System.out.println("c) How many people are 21 years old or older? " + moreThan21);
        }
    }
}
