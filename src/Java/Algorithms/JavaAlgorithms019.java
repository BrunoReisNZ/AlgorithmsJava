//19) Create an algorithm that reads the name and two grades of a student,
// calculate your average and show on the screen.
// In the end, analyze the average and show whether or not the student had a good grade (whether above average 7.0).


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms019 {
    public static void checkStudentGrade (double firstGrade, double secondGrade){
        double average = (firstGrade + secondGrade) / 2;
        if (average < 7) {
            System.out.println("Your average was: " + average);
            System.out.println("You failled");
        } else {
            System.out.println("Your average was: " + average);
            System.out.println("You passed");    }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Student Name: ");
        String studentName = input.nextLine();
        System.out.print("Fisrt Grade: ");
        double firstGrade = input.nextDouble();
        System.out.print("Second Grade: ");
        double secondGrade = input.nextDouble();

        checkStudentGrade(firstGrade, secondGrade);
    }
}
