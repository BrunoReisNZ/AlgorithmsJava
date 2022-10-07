//45) Program #44 will have a problem when we enter the first value greater than the last.
// Solve this problem with code that works in any //situation.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms045 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Value: ");
        int v1 = input.nextInt();
        System.out.print("Enter the last Value: ");
        int v2 = input.nextInt();
        System.out.print("Enter the increment: ");
        int inc = input.nextInt();

        if (v1 < v2) {
            for (int i = v1; i <= v2; i+= inc) {
                System.out.print(i + " ");
            }
            System.out.print("It's over!");
        } else if (v1 > v2) {
            for (int i = v1; i > v2; i-= inc) {
                System.out.print(i + " ");
            }
            System.out.print("It's over!");
        }
    }
}
