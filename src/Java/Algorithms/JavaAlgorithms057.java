//57) Develop an app that reads the salary and gender of multiple employees.
// At the end, show the total wages paid to men and the total paid to women.
// The program will ask the user whether or not he wants to continue whenever it reads an employee's data.

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms057 {

    public static void main(String[] args) {

        double salary;
        int gender;
        double sumSalaryMan = 0;
        double sumSalaryWooman = 0;
        int cont;
        boolean proceed;
        proceed = true;


        while (proceed) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert Salary: ");
            salary = input.nextDouble();
            System.out.print("Insert Gender (1 for male, 2 for female): ");
            gender = input.nextInt();
            System.out.print("Do you want to insert another one (1 for yes, 2 for no?)");
            cont = input.nextInt();

                if (gender == 1) {
                    sumSalaryMan = sumSalaryMan + salary;
                } else if (gender == 2) {
                    sumSalaryWooman = sumSalaryWooman + salary;

                }
                if (cont == 2) {
                    proceed = false;
                }
        }
        System.out.println("Total wages paid to men: " + sumSalaryMan);
        System.out.println("Total wages paid to woman: " + sumSalaryWooman);
    }

}
