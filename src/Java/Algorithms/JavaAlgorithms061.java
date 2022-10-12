//LOOPS WITH DO WHILE
//61) Create a program that displays the following count on the screen, using the “do while” structure
//0 3 6 9 12 15 18 21 24 27 30 It's over!
package Java.Algorithms;

public class JavaAlgorithms061 {

    public static void main(String[] args) {

        int index = 0;

        do {
            System.out.print(index + " ");
            index+=3;
        } while (index <=30);

        System.out.println(" It's over!");
    }
}
