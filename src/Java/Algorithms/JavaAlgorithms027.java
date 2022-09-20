//27) Create a program that reads two grades from a student and calculates their average,
// showing a message at the end, according to the average achieved:
//- Average up to 4.9: FAIL
//- Average between 5.0 and 6.9: SUMMER SCHOOL CLASSES
//- Average 7.0 or higher: APPROVED

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms027 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insert the first grade: ");
        double firstGrade = input.nextDouble();
        System.out.print("Insert the second grade: ");
        double secondGrade = input.nextDouble();

        double averageGrade = (firstGrade + secondGrade)/2;
        System.out.println("The student average grade is: " + averageGrade);


        if (averageGrade < 5) {
            System.out.println("The student FAIL");
        } else if (averageGrade >= 5 && averageGrade< 7) {
            System.out.println("The student have to attend to SUMMER SCHOOL CLASSES");
        } else {
            System.out.println("The student is APPROVED.");
        }
    }
}
