//40) Create an application that displays the following count on the screen:
//0 3 6 9 12 15 18 It's over!

package Java.Algorithms;

public class JavaAlgorithms040 {

    public static void main(String[] args) {

        int number = 0;

        while (number <= 18) {
            System.out.print(number + " ");
            number += 3;
        }
        System.out.println("It's over!");
    }
}
