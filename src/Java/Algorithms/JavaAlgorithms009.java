//BASIC SEQUENCES
//9) Make an algorithm that reads how much money a person has in their wallet (in NZD)
//        and show how many U$ dollars she can buy. Consider US$1.00 = NZ$ 1.7.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms009 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How much NZ$ do you want to convert to US$: ");
        double newZealandDollar = input.nextDouble();
        double unitedStatesDollar = newZealandDollar/1.7;
        System.out.println("The amount of NZ$ " + newZealandDollar + " can be converted to US$ " +unitedStatesDollar    );
    }
}
