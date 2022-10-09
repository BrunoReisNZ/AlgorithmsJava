//BASIC SEQUENCES
//12) Create a program that reads the price of a product, calculates and displays its
//        PROMO PRICE, with 5% discount.

package Java.Algorithms;
import java.util.Scanner;

public class JavaAlgorithms012 {
    static double applyDiscount(double productPrice){
        double priceAfterDiscount = productPrice*0.95;
        return priceAfterDiscount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Product Price: ");
        double productPrice = input.nextDouble();
        System.out.println("Price after Discount: " + applyDiscount(productPrice));

    }
}
