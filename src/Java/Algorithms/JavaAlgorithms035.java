//35) A car rental company needs to charge for their services.
// Car rental costs R$90 per day for a popular car and R$150 per day for a luxury car.
// In addition, the customer pays per km traveled.
// Make a program that reads the type of rental car (popular or luxury),
// how many days rented and how many km were driven.
// At the end show the price to be paid according to the
// following table:
//- Popular cars (R$90 per day rental)
//- Up to 100 km covered: R$0.20 per km
//- Over 100 km travelled: R$0.10 per km
//- Luxury cars (R$150 per day rental)
//- Up to 200 km traveled: R$0.30 per km
//- Over 200 km traveled: R$0.25 per km

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms035 {

    public static void main(String[] args) {

        System.out.println("######CAR RENTAL#######");
        System.out.println("######CAR MODEL#######");
        System.out.println("Insert the model of the vehicle");
        System.out.println("For POPULAR type 1 ");
        System.out.println(("For LUXURY type 2 "));
        System.out.print(("Car Model: "));
        Scanner input = new Scanner(System.in);
        int carModel = input.nextInt();

        System.out.println("######DAYS RENTED#######");
        System.out.print("Insert the number of days rented: ");
        int daysRented = input.nextInt();

        System.out.println("######KILOMETERS#######");
        System.out.print("Insert the number of Kms driven: ");
        int kmsDriven = input.nextInt();

        double priceToPay;

        if (carModel == 1 && kmsDriven <= 100) {
            priceToPay = (90*daysRented) + (kmsDriven*0.2);
        } else if (carModel == 1 && kmsDriven > 100) {
            priceToPay = (90*daysRented) + (kmsDriven*0.1);
        } else if (carModel == 2 && kmsDriven <= 100) {
            priceToPay = (150*daysRented) + (kmsDriven*0.30);
        } else {
            priceToPay = (150*daysRented) + (kmsDriven*0.25);
        }

        System.out.println("############################");
        System.out.println("The rental price is : $" + priceToPay);
    }
}