//24) Write an algorithm that asks the distance a passenger wants to travel in km.
// Calculate the ticket price, charging R$0.50 per km for trips up to 200Km
// and R$0.45 for longer trips.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms024 {

    public static double travelCost (double distance) {

        double cost = 0;

        if (distance <= 200) {
            cost = distance * 0.50;
        } else {
            cost = distance * 0.45;
        }
        return cost;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Distance to travel: ");
        int distance = input.nextInt();

        System.out.println("The cost of the travel is: " + travelCost(distance));

    }
}


