//LOOPS WITH FOR
//69) [CHALLENGE] Develop a program that reads the first term and the ratio of an AP
// (Arithmetic Progression), showing on the screen the first 10 elements of the AP
// and the sum of all the values of the sequence.
//an=a1+(n-1)r
//- a is the term
//- r is the reason
//- n is the number of the term we want to find.


package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms069Challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("insert first term: ");
        int a = input.nextInt();
        System.out.print("insert the ratio: ");
        int r = input.nextInt();
        int n = 0;
        int an = 0;
        int sum = 0;

        for (n = 1; n <= 10; n++) {

            an = a + (n - 1) * r;
            System.out.print(an + ", ");
            sum = sum + an;
        }
        System.out.println("");

        System.out.println(sum);

        }

    }
