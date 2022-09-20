//16) [CHALLENGE]
// Write a program to calculate the reduction in the lifetime of a smoker.
// Ask how many cigarettes he smoked per day and how many years he has smoked.
// Assume that a smoker loses 10 minutes of life with each cigarette.
// Calculate how many days of life a smoker will lose and display the total in days.


package Java.Algorithms;
import java.util.Scanner;

public class JavaAlgorithms016Challenge {

    public static int calculatingDaysOfLife(int cigarretsPerDay, int yearsSmoking){
        int minutesOfLife = (cigarretsPerDay * 10) * (yearsSmoking * 365);
        int daysOfLife = minutesOfLife/365;
        return daysOfLife;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("How many cigarrets per day: ");
        int cigarretsPerDay = input.nextInt();
        System.out.print("How many years since start smoking: ");
        int yearsSmoking = input.nextInt();

        System.out.println("Total of days lost in life: " + calculatingDaysOfLife(cigarretsPerDay,yearsSmoking));
    }
}
