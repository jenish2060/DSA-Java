// Curved Surface Area of Cylinder

import java.text.DecimalFormat;
import java.util.Scanner;

public class CSAofCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = input.nextInt();
        System.out.println("Enter the height : ");
        int height = input.nextInt();
        double volume = 2 * Math.PI * radius * height;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("The curved surface area of cylinder : "+ df.format(volume));
    }
}
