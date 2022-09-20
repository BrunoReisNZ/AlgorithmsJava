//33) Write a program to approve or not the bank loan for the purchase of a house.
// The program will ask for the value of the home, the buyer's salary and how many years he will pay.
// Calculate the amount of the monthly installment, knowing that it cannot exceed 30% of the salary
// or else the loan will be denied.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms033 {

    static boolean loanApproval (double houseValue, double clientSalary, int yearsToPay) {

        boolean loanApproved;
        double monthlyPayment = houseValue / (yearsToPay * 12);
        double maximumPayment = clientSalary * 0.3;

        if (monthlyPayment <= maximumPayment) {
            loanApproved = true;
        } else {
            loanApproved = false;
        }
        return loanApproved;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the House Value: ");
        double houseValue = input.nextDouble();
        System.out.print("Input the Client Salary: ");
        double clientSalary = input.nextDouble();
        System.out.print("Input How Many Years to Pay: ");
        int yearsToPay = input.nextInt();

        if (loanApproval(houseValue, clientSalary, yearsToPay)) {
            System.out.println("Congractulations, your loan was approved");
        } else {
            System.out.println("Your loan was denied.");
        }
    }
}
