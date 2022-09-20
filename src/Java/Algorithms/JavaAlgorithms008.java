//8) Develop a program that reads a distance in meters and displays the values relative to other measures.
//        Ex:
//        Enter a distance in meters: 185.72
//        The distance of 85.7m corresponds to:
//        0.18572Km
//        1857.2dm
//        1.8572Hm
//        18572.0cm
//        18,572 dam
//        185720.0mm

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms008 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a distance in meters: ");
        double distance = input.nextDouble();
        System.out.println("The distance of " + distance + " corresponds to: ");
        System.out.println(distance/1000 + "kms.");
        System.out.println(distance/100 + "dm.");
        System.out.println(distance/10 + "hm.");
        System.out.println(distance*10 + "cm.");
        System.out.println(distance*100 + "dam.");
        System.out.println(distance*1000 + "mm.");
    }
}
