//32) [CHALLENGE] Create a game where the computer will draw a number between 1 and 5,
// the player will try to find out what the value was drawn.


package Java.Algorithms;

import java.util.Random;
import java.util.Scanner;

public class JavaAlgorithms032Challenge {

    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        System.out.print("Choose a number between 1 and 5: ");
        int playerChoice = choice.nextInt();

        Random random = new Random();
        int computerChoice = random.nextInt(5);
        computerChoice = computerChoice + 1;

        System.out.println("The computer choose: " + computerChoice);

        if (playerChoice == computerChoice) {
            System.out.println("You got it!");
        } else {
            System.out.println("Try again");
        }
    }
}
