//42) Write an algorithm that asks the user for any positive integer and displays a count up to that value:
//        Ex: Enter a value: 35
//        Count: 1 2 3 4 5 6 7 ... 33 34 35 It's over!

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms042 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        int count = 1;

        while (count <= number) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("It's over!");
    }
}
