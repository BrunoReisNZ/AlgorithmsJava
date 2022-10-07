//47) Develop an application that shows on the screen the result of the expression
// 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
// 2750

package Java.Algorithms;

public class JavaAlgorithms047 {

    public static void main(String[] args) {

        int index = 500;
        int sum = 0;

        while (index >= 0) {
            if (index>= 50) {
                System.out.print(index + " + ");
            }
            sum = sum+index;
            index -= 50;

        }
        System.out.println("0" + " = " + sum);
    }


}
