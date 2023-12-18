// Calculate Distance Between Two Points

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the first point : ");
        float x1 = input.nextFloat();
        System.out.println("Enter the y-coordinate of the first point : ");
        float y1 = input.nextFloat();

        System.out.println("Enter the x-coordinate of the second point : ");
        float x2 = input.nextFloat();
        System.out.println("Enter the x-coordinate of the second point : ");
        float y2 = input.nextFloat();

        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Distance : " + df.format(distance) + " unit.");
    }
}
