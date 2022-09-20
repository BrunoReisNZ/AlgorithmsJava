//23) In an exclusive promotion for Women's Day, a store wants to give discounts to everyone,
// but especially to women. Make a program that reads the customer's name, gender,
// and value of purchases and calculates the discounted price. Knowing that:
//        - Men get 5% off
//        - Women get 13% off

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms023 {

    public static double discountedPrice (int clientGender, double purchageValue) {

        double priceAfterDiscount = 0;

        if (clientGender == 1) {
            priceAfterDiscount = purchageValue * 0.95;
        } else if (clientGender == 2) {
            priceAfterDiscount = purchageValue * 0.87;
        } else {
            System.out.println("Wrong gender input.");
            System.out.println("Start again.");
        }
        return priceAfterDiscount;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String clientName = input.nextLine();
        System.out.print("Insert the value of purchase: ");
        double purchaseValue = input.nextDouble();
        System.out.print("Insert 1 for Male or 2 for Female: ");
        int clientGender = input.nextInt();

        System.out.println("The discounted price is: " + discountedPrice(clientGender, purchaseValue));
    }
}
