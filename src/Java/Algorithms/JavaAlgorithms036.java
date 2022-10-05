//A healthy living program wants to give points for physical activities that can be redeemed for cash.
// The system works like this:
//- Every hour of physical activity in the month is worth points
//- up to 10 hours of activity per month: earn 2 points per hour
//- from 10h to 20h of activity in the month: earn 5 points per hour
//- over 20 hours of activity per month: earn 10 points per hour
//- For each point earned, the customer get R$0.05 (5 cents)
//Make a program that reads how many hours of activity a person had per month,
// calculates and displays how many points they had and how much money they managed to earn.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms036 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insert how many hours of activity: ");
        int hoursOfActivity = input.nextInt();
        int clientPoints;

        if (hoursOfActivity <= 10) {
            clientPoints = hoursOfActivity * 2;
        } else if (hoursOfActivity > 10 && hoursOfActivity <= 20) {
            clientPoints = hoursOfActivity * 5;
        } else {
            clientPoints = hoursOfActivity * 10;
        }

        double valueEarned = clientPoints * 0.05;

        System.out.println("You earned: $" + valueEarned);

    }
}



