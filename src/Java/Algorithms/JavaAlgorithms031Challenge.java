//31) [CHALLENGE] Create a game of JoKenPo (Rock-Paper-Scissors)

package Java.Algorithms;

import java.util.Random;
import java.util.Scanner;

public class JavaAlgorithms031Challenge {

    static void RockPaperScissorsGame (int playerChoice, int computerChoice) {

        if (playerChoice == 0 && computerChoice == 0) {
            System.out.println("You choose: Rock");
            System.out.println("The computer choose: Rock");
            System.out.println("Result: Draw");
        }
        if (playerChoice == 1 && computerChoice == 1) {
            System.out.println("You choose: Paper");
            System.out.println("The computer choose: Paper");
            System.out.println("Result: Draw");
        }
        if (playerChoice == 2 && computerChoice == 2) {
            System.out.println("You choose: Scissors");
            System.out.println("The computer choose: Scissors");
            System.out.println("Result: Draw");
        }
        if (playerChoice == 0 && computerChoice == 1) {
            System.out.println("You choose: Rock");
            System.out.println("The computer choose: Paper");
            System.out.println("Result: Paper beats Rock. Computer Won!");
        }
        if (playerChoice == 0 && computerChoice == 2) {
            System.out.println("You choose: Rock");
            System.out.println("The computer choose: Scissors");
            System.out.println("Result: Rock beats Scissors. You Won!");
        }
        if (playerChoice == 1 && computerChoice == 0) {
            System.out.println("You choose: Paper");
            System.out.println("The computer choose: Rock");
            System.out.println("Result: Paper beats Rock. You Won!!");
        }
        if (playerChoice == 1 && computerChoice == 2) {
            System.out.println("You choose: Paper");
            System.out.println("The computer choose: Scissors");
            System.out.println("Result: Scissors beats Paper. Computer Won!!");
        }
        if (playerChoice == 2 && computerChoice == 0) {
            System.out.println("You choose: Scissors");
            System.out.println("The computer choose: Rock");
            System.out.println("Result: Rock beats Scissors. Computer Won!!");
        }
        if (playerChoice == 2 && computerChoice == 1) {
            System.out.println("You choose: Scissors");
            System.out.println("The computer choose: Paper");
            System.out.println("Result: Scissors beats Paper. You Won!!");
        }
        if (playerChoice == 3) {
            System.out.println("You choose to leave the game. Good Bye!");
            System.out.println("#######################################");
        }
        if (playerChoice != 0 && playerChoice != 1 && playerChoice != 2 && playerChoice != 3) {
            System.out.println("Invalid Option. Start again");
            System.out.println("#######################################");
        }
    }

        public static void main(String[] args) {

        System.out.println("##############################");
        System.out.println("Lets play Rock-Paper-Scissors?");
        System.out.println("##############################");

        Scanner choice = new Scanner(System.in);
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");
        System.out.println("3 – Leave the game");
        System.out.print("Choose one of the options above: ");
        int playerChoice = choice.nextInt();

        Random random = new Random();
        int computerChoice = random.nextInt(3);
        System.out.println("######################################");

        RockPaperScissorsGame(playerChoice, computerChoice);

     }
}
