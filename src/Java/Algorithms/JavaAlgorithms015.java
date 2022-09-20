//15) Create a program that reads the number of days worked in a month and displays an employee's salary,
// knowing that he works 8 hours a day and earns R$25 per hour worked.


package Java.Algorithms;
import java.util.Scanner;

public class JavaAlgorithms015 {

    public static int calculatingSalary(int daysWorked){
        int Salary = daysWorked * 8 * 25;
        return Salary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of days worked: ");
        int daysWorked = input.nextInt();

        System.out.println("Total price: " + calculatingSalary(daysWorked));
    }
}