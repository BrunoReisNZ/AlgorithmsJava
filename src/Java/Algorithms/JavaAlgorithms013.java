//13) Make an algorithm that reads an employee's salary, calculates and displays his new salary, with a 15% increase.

package Java.Algorithms;
import java.util.Scanner;

public class JavaAlgorithms013 {

    public static double apply15PercentRaise(double employeeSalary){
        double salaryAfterRaise = employeeSalary*1.15;
        return salaryAfterRaise;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Employee salary: ");
        double employeeSalary = input.nextDouble();

        System.out.println("Salary after raise: " + apply15PercentRaise(employeeSalary));
    }
}
