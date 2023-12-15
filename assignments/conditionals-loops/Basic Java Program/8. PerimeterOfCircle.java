// Perimeter of Circle

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = input.nextInt();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of circle is : "+ perimeter);
    }
}
