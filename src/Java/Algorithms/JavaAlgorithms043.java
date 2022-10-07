// 43) Develop an algorithm that shows a countdown from 30 to 1, marking the numbers that are divisible by 4, exactly as shown below:
//30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...

package Java.Algorithms;

public class JavaAlgorithms043 {

    public static void main(String[] args) {

        int number = 30;
        while (number >= 1 && number % 4 != 0) {
            System.out.print(number + " ");
            number--;
            if (number % 4 == 0 && number != 0) {
                System.out.print("[" + number + "] ");
                number--;
            }
        }
    }
}
