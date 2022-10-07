//51) Make an app that reads the price of 8 products.
// At the end, show on the screen which was the highest and which was the lowest price entered.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms051 {

    public static void main(String[] args) {

        int index = 0;
        double highest = 0.0;
        double temp = 0.0;
        double lowest = 0.0;

        while (index < 8) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert the price: ");
            double n = input.nextDouble();

            if (n >= highest) {
                highest = n;
            } else {
                temp = n;
            }
            if (n <= temp){
                lowest = n;
            }
            index++;
        }
        System.out.println("highest: " + highest);
        System.out.println("lowest: " + lowest);
    }
}
