//11) Develop a logic that reads the values of A, B, and C from an equation of the
//        second degree and show the value of Delta.

//delta = b2 - 4ac


package Java.Algorithms;

import java.util.Scanner;
import java.lang.Math;

public class JavaAlgorithms011 {

    static double calculatingDelta() {
        Scanner input = new Scanner(System.in);
        System.out.print("Value of a: ");
        double a = input.nextDouble();
        System.out.print("Value of b: ");
        double b = input.nextDouble();
        System.out.print("Value of c: ");
        double c = input.nextDouble();

        double delta = (Math.pow(b,2)) - 4*a*c;
        return delta;
    }

    public static void main(String[] args) {

        System.out.println("The delta of the equation is: " + calculatingDelta());
    }
}
