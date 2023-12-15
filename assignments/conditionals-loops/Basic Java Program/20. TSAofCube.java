// Total Surface Area of Cube

import java.text.DecimalFormat;
import java.util.Scanner;

public class TSAofCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side length : ");
        int a = input.nextInt();
        double volume = 6 * Math.pow(a,2);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("The total surface area of cube : "+ df.format(volume));
    }
}
