//ARRAYS
//77) Write a program that reads 7 names of people and stores them in a array.
// At the end, show a list with all the names entered, in the reverse order of the one in which they were entered.

package Java.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAlgorithms077 {

    public static void main(String[] args) {

        String[] myArray = new String[7];

        for (int i = 0; i < myArray.length; i++) {

            Scanner input = new Scanner(System.in);
            System.out.print("Insert a name: ");
            String name = input.nextLine();
            myArray[i] = name;
        }
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}
