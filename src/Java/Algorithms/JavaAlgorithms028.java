//28) Write a program that reads the width and length of a rectangular land,
// calculating and displaying its area in m2. The program should also show the classification of this land,
// according to the list below:
//- Below 100m2 = POPULAR LAND
//- Between 100m2 and 500m2 = MASTER LAND
//- Over 500m2 = VIP LAND

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms028 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insert the terrain width (mts): ");
        double terrainWidth = input.nextDouble();
        System.out.print("Insert the terrain length (mts): ");
        double terrainLenght = input.nextDouble();

        double terrainArea = terrainWidth * terrainLenght;
        System.out.println("The terrain Area is: " + terrainArea + " mts2.");

        if (terrainArea < 100) {
            System.out.println("POPULAR LAND");
        } else if (terrainArea >= 100 && terrainArea < 500) {
            System.out.println("MASTER LAND");
        } else {
            System.out.println("VIP LAND");
        }
    }
}
