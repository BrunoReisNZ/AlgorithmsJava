//48) Write a program that reads 7 integers and at the end shows the sum between them.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms048 {

    public static void main(String[] args) {

        int index = 0;
        int sum = 0;

        while (index < 7) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert a number: ");
            int n = input.nextInt();
            sum = sum+n;

            index++;
        }
        System.out.println("The sum is : " + sum);
    }
}
