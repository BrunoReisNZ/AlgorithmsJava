//54) Develop an application that reads the weight and height of 7 people, showing at the end:
//a) What was the average height of the group
//b) How many people weigh more than 90 kg
//c) How many people weighing less than 50 kg are less than 1.60 m tall?
//d) How many people who measure more than 1.90m weigh more than 100Kg.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms054 {
    public static void main(String[] args) {

        int index = 0;
        int moreThen90 = 0;
        int weightLess50Heightless160 = 0;
        int weightMore100Heightmore190 = 0;
        double hightSum = 0.0;
        double hightAverage;

        while (index < 7) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert the weight: ");
            double weight = input.nextDouble();
            System.out.print("Insert the height: ");
            double height = input.nextDouble();

            hightSum = hightSum + height;


            if (weight >= 90) {
                moreThen90++;
            }
            if (weight < 50 && height < 1.6) {
                weightLess50Heightless160++;
            }
            if (weight > 100 && height > 1.9) {
                weightMore100Heightmore190++;
            }

            index++;
        }
        hightAverage = hightSum / index;

        System.out.println("a) What was the average height of the group? " + hightAverage);
        System.out.println("b) How many people weigh more than 90 kg? " + moreThen90);
        System.out.println("c) How many people weighing less than 50 kg are less than 1.60 m tall? " + weightLess50Heightless160);
        System.out.println("d) How many people who measure more than 1.90m weigh more than 100Kg? " + weightMore100Heightmore190);
    }
}
