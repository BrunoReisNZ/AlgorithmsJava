// 49) Create a program that reads 6 integers and at the end shows how many of them are even and how many are odd.
package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms049 {

    public static void main(String[] args) {

    int index = 0;
    int odd = 0;
    int even = 0;

        while (index < 6) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert a number: ");
            int n = input.nextInt();

            if (n%2 == 0) {
                even++;
            } else {
                odd++;
            }
            index++;
        }
        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);
    }
}
