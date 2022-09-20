// 25) [CHALLENGE] Create a program that reads the length of three line segments.
// Analyze their lengths and say if it is possible to form a triangle with these lines.
// Mathematically, for three segments to form a triangle, the length of each side must be less than the sum of the other two.


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms025Challenge {

    static boolean checkIfIIsATriangle (double l1, double l2, double l3) {

        boolean isATriangle;
        if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {
            isATriangle = false;
        } else {
            isATriangle = true;
        }
        return isATriangle;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input Line Segment 1: ");
        double l1 = input.nextDouble();
        System.out.print("Input Line Segment 2: ");
        double l2 = input.nextDouble();
        System.out.print("Input Line Segment 3: ");
        double l3 = input.nextDouble();

        System.out.println("Can form a triangle? " + checkIfIIsATriangle(l1, l2, l3));
    }
}
