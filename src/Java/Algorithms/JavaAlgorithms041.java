//Develop a program that displays the following count on the screen:
//100 95 90 85 80 ... 0 It's over!

package Java.Algorithms;

public class JavaAlgorithms041 {

    public static void main(String[] args) {

        int number = 100;
        while (number >= 0) {
            System.out.print(number + " ");
            number -=5;
        }
        System.out.print("It's over!");
    }
}
