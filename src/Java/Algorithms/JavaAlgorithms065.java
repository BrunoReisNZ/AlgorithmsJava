//LOOPS WITH FOR
//65) Develop a program using the “to” structure that displays the following count on the screen:
//        100 90 80 70 60 50 40 30 20 10 0 It's over!


package Java.Algorithms;

public class JavaAlgorithms065 {

    public static void main(String[] args) {

        int i = 100;

        for (i = 100; i>=0; i-=5) {
            System.out.print(i + " ");
        }
        System.out.println("It's Over!");

    }
}
