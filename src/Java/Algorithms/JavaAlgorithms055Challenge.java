//55) [CHALLENGE] Let's improve the game we did in exercise 32.
// From now on, the computer will draw a number between 1 and 10
// and the player will have 4 attempts to try to get it right.

package Java.Algorithms;

import java.util.Random;
import java.util.Scanner;

public class JavaAlgorithms055Challenge {

    public static void main(String[] args) {

        Random random = new Random();
        int computerChoice = random.nextInt(10);
        computerChoice = computerChoice + 1;
        //System.out.println(computerChoice);

        int index = 0;
        int playerChoice;

        while (index < 4) {

            Scanner choice = new Scanner(System.in);
            System.out.print("Choose a number between 1 and 10: ");
            playerChoice = choice.nextInt();

            if (playerChoice == computerChoice) {
                System.out.println("You got it!");
                break;
            }
            index++;
        }
    }
}
