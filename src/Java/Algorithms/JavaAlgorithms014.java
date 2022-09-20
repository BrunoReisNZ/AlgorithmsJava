//14) The car rental company needs your help to charge for their services.
//Write a program that asks the number of kilometers traveled by a rented car
//and the number of days for which it was rented. Calculate the total price to pay,
//knowing that the car costs R$90 per day and R$0.20 per km driven.

package Java.Algorithms;
import java.util.Scanner;

public class JavaAlgorithms014 {

    public static double calculatingPrice(double kilometersTraveled, int daysRented){
        double totalPrice = (kilometersTraveled * 0.20) + (daysRented * 90);
        return totalPrice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number kilometers traveled: ");
        double kilometersTraveled = input.nextDouble();
        System.out.print("Enter the number of days the car was rented: ");
        int daysRented = input.nextInt();

        System.out.println("Total price: " + calculatingPrice(kilometersTraveled,daysRented));
    }
}
