//46) Create a program that calculates and displays on the screen
// the result of the sum between 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
//2544
package Java.Algorithms;

public class JavaAlgorithms046 {

    public static void main(String[] args) {

        int index = 6;
        int sum = 0;

        while (index<=100) {
            if (index<=98) {
                System.out.print(index + " + ");
            }
            sum = sum+index;
            index += 2;

        }
        System.out.println("100" + " = " + sum);
    }

}
