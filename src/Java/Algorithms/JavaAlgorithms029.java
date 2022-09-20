//29) Develop a program that reads an employee's name, his salary,
// how many years he has worked at the company and displays his new salary,
// readjusted according to the following table:
//        - Up to 3 years with the company: 3% increase
//        - between 3 and 10 years: increase of 12.5%
//        - 10 years or more: 20% increase

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms029 {

    static double newSalary (double employeeSalary, int employeeYearsOfCompany) {

        double employeeNewSalary;

        if (employeeYearsOfCompany <= 3) {
            employeeNewSalary = employeeSalary * 1.03;
        } else if (employeeYearsOfCompany > 3 && employeeYearsOfCompany <= 10) {
            employeeNewSalary = employeeSalary * 1.125;
        } else {
            employeeNewSalary = employeeSalary * 1.2;
        }
        return employeeNewSalary;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insert Employee Name: ");
        String employeeName = input.nextLine();
        System.out.print("Insert Employee Salary: ");
        double employeeSalary = input.nextDouble();
        System.out.print("Insert Employee Years of Company: ");
        int employeeYearsOfCompany = input.nextInt();

        System.out.println(employeeName + " new salary is: " + newSalary(employeeSalary,employeeYearsOfCompany));

    }
}
