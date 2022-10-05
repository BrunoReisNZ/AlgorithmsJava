//37) A company needs to readjust the salary of its employees,
// giving an increase according to some factors.
// Make a program that reads the current salary, the gender of the employee,
// and how many years that employee has been with the company.
//At the end, show his new salary, based on the following table:
//- Women
//- less than 15 years in the company: +5%
//- from 15 to 20 years in the company: +12%
//- more than 20 years in the company: +23%
//- Men
//- less than 20 years in the company: +3%
//- from 20 to 30 years in the company: +13%
//- more than 30 years in the company: +25%

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms037 {

    static double calculatingNewSalary (int gender, int years, double salary) {

        double newSalary = 0;

        if (gender == 1) {
            if (years < 20) {
                newSalary = salary * 1.03;
            } else if (years >= 20 && years <= 30) {
                newSalary = salary * 1.13;
            } else {
                newSalary = salary * 1.25;
            }
        }
        if (gender == 2) {
            if (years < 15) {
                newSalary = salary * 1.05;
            } else if (years >= 15 && years <= 20) {
                newSalary = salary * 1.12;
            } else {
                newSalary = salary * 1.23;
            }
        }
        return newSalary;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Employee's Name: ");
        String name = input.nextLine();

        System.out.print("Employee's Gender (1 for Male | 2 for Female): ");
        int gender = input.nextInt();

        System.out.print("Employee's Years of Company: ");
        int years = input.nextInt();

        System.out.print("Employee's Actual Salary: ");
        double salary = input.nextDouble();

        System.out.println("The employee " + name + " new salary is: $" + calculatingNewSalary(gender, years, salary));
    }
}
