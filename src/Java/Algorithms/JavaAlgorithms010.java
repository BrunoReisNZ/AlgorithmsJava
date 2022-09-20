//10) Write an algorithm that reads the width and height of a wall, calculates and
//        show the area to be painted and the amount of paint needed for the job,
//        knowing that each liter of paint paints an area of 2 square meters.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double areaOfWall = width*height;
        double amountOfPaint = areaOfWall/2;

        System.out.println("The area of the wall is : " + areaOfWall + "Mts2");
        System.out.println(("The amount of paint needed is: " + amountOfPaint + " litres"));

    }
}
