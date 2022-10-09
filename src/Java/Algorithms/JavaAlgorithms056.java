//56) Create a program that reads several numbers on the keyboard and shows the sum of them at the end.
//Note: The program will be interrupted when the number 1111 is entered

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms056 {

    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        while (number != 1111) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = input.nextInt();
            sum = sum+number;
        }
        System.out.println(sum);
    }
}
