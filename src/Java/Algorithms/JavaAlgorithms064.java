//LOOPS WITH FOR
//64) Develop a program using the “for” structure that displays the following count on the screen:
//        0 5 10 15 20 25 30 35 40 It's over!


package Java.Algorithms;

public class JavaAlgorithms064 {

    public static void main(String[] args) {

        int i = 0;

        for (i = 0; i<=40; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println("It's Over!");

    }
}
