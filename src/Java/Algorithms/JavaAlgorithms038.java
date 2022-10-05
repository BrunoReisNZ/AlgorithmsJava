//38) Write a program that displays the following count on the screen:
//6 7 8 9 10 11 It's over!

package Java.Algorithms;

public class JavaAlgorithms038 {

    public static void main(String[] args) {

        int number = 5;

        while (number < 11) {
            number +=1;
            System.out.print(number + " ");
        }
        System.out.println("It's over!");
    }
}
