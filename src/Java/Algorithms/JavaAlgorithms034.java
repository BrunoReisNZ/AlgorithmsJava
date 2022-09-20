//34) The Body Mass Index (BMI) is a calculated value based on a person's height and weight.
// According to the BMI value, we can classify the individual within certain ranges.
//        - below 18.5: Underweight
//        - between 18.5 and 25: Ideal weight
//        - between 25 and 30: Overweight
//        - between 30 and 40: Obesity
//        - over 40: morbid obesity
//        Note: BMI is calculated by the expression weight/height2 (weight divided by the square
//        height)

package Java.Algorithms;

import java.util.Scanner;

public class JavaAlgorithms034 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Input the weight (kgs): ");
        double weight = input.nextDouble();
        System.out.print(" Input the height (mts): ");
        double height = input.nextDouble();

        double valueBMI = weight/Math.pow(height,2);
        String rangeBMI;

        if (valueBMI < 18.5) {
            rangeBMI = "Underweight";
        } else if (valueBMI >= 18.5 && valueBMI<25) {
            rangeBMI = "Ideal weight";
        } else if (valueBMI >= 25 && valueBMI<30) {
            rangeBMI = "Overweight";
        } else if (valueBMI >= 30 && valueBMI<40) {
            rangeBMI = "Obesity";
        } else {
            rangeBMI = "Morbid Obesity";
        }

        System.out.println("The BMI value is: " + valueBMI);
        System.out.println("The BMI range is: " + rangeBMI);

    }
}
