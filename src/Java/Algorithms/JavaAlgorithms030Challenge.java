//30) [CHALLENGE] Redo algorithm 25, adding the feature to show what kind of triangle will be formed:
//- EQUILATERAL: all sides equal
//- ISOSCELES: two equal sides
//- SCALENO: all different sides

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms030Challenge {
    static boolean checkIfIIsATriangle (double l1, double l2, double l3) {
        boolean isATriangle;
        if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {
            isATriangle = false;
        } else {
            isATriangle = true;
        }
        return isATriangle;
    }
    static String declareWhatTypeOfTriangle (double l1, double l2, double l3) {
        String typeOfTriangle = "Null";
        if (checkIfIIsATriangle(l1, l2, l3)) {
            if (l1 == l2 && l2 == l3) {
                typeOfTriangle = "EQUILATERAL";
            } else if ((l1 == l2 && l2 != l3) || (l2 == l3 && l2 != l1) || (l1 == l3 && l1 != l2)) {
                typeOfTriangle = "ISOSCELES";
            } else {
                typeOfTriangle = "SCALENO";
            }
        }
        return typeOfTriangle;
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
        System.out.println("The type of triangle is: " + declareWhatTypeOfTriangle(l1, l2, l3));
    }
}