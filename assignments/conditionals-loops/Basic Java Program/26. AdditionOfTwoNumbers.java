// Addition of Two Numbers

import java.text.DecimalFormat;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number : ");
        double num2 = input.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        double sum = num1 + num2;
        System.out.println("The sum is : "+ df.format(sum));
    }
}
