//17) Write a program that asks the speed of a car.
// If it exceeds 80km/h, display a message saying the user has been fined.
// In this case, display the amount of the fine, charging $ 5 for each km above the allowed speed.


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms017 {


    public static void checkSpeed (int carSpeed){
        if (carSpeed > 80) {
            int overMaximumSpeed = carSpeed - 80;
            int fine = overMaximumSpeed*5;
            System.out.println("You are traveling above maximum speed.");
            System.out.println("Your fine is: $"+ fine );
        } else {
            System.out.println("You are traveling at/under maximum speed. Take care.");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Car Speed: ");
        int carSpeed = input.nextInt();

        checkSpeed(carSpeed);
    }
}
