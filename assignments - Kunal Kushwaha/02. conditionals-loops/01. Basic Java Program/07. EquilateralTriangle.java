// Area of Equilateral Triangle

import java.text.DecimalFormat;
import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of side : ");
        int a = input.nextInt();
        double area = Math.sqrt(3)/4 * Math.pow(a,2);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("The area of equilateral triangle is : "+ df.format(area));
    }
}
