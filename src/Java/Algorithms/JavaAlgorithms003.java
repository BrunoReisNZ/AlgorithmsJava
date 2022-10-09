//BASIC SEQUENCES
//3) Create a program that reads an employee's name and salary, showing in the
//        end a message.
//        Ex:
//        Employee Name: Mary Anne
//        Salary: 1850.45
//        Employee Mary Anne has a salary of R$1850.45 in June.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms003 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Employee Name: ");
        String name = input.nextLine();
        System.out.print("Employee Salary: ");
        double salary = input.nextDouble();

        System.out.println("Employee " + name + " has a salary of " + salary + " in June.");

    }
}
