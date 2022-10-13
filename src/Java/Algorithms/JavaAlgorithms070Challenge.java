//LOOPS WITH FOR
//70) [CHALLENGE] Write a program that displays the first 10 elements of the Fibonacci Sequence:
//1 1 2 3 5 8 13 21...

package Java.Algorithms;

public class JavaAlgorithms070Challenge {

    public static void main(String[] args){
        int num1 = 1, num2 = 0;

        System.out.print(num2 + ",");
        System.out.print(num1 + ",");

        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(num1 + ",");
        }
    }

}
