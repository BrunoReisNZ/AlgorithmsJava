//44) Create an algorithm that reads the count start value, end value and increment, then displays all values in the range:
//Ex: Enter the first Value: 3
//Enter the last Value: 10
//Enter the increment: 2
//Count: 3 5 7 9 It's over!


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms044 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Value: ");
        int v1 = input.nextInt();
        System.out.print("Enter the last Value: ");
        int v2 = input.nextInt();
        System.out.print("Enter the increment: ");
        int inc = input.nextInt();

        for (int i = v1; i <= v2; i+= inc) {
            System.out.print(i + " ");
        }
        System.out.print("It's over!");
    }
}
