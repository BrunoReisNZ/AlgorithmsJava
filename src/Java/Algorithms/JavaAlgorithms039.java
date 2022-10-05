//39) Make an algorithm that displays the following count on the screen:
//10 9 8 7 6 5 4 3 It's over!

package Java.Algorithms;

public class JavaAlgorithms039 {

    public static void main(String[] args) {

        int number = 10;

        while (number > 2) {
            System.out.print(number + " ");
            number--;
        }
        System.out.println("It's over!");
    }


}
