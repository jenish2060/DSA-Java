import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = input.nextInt();
        System.out.println("Enter the height : ");
        int height = input.nextInt();
        double volume = Math.PI * Math.pow(radius,2) * height;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("The volume of cylinder is : "+ df.format(volume));
    }
}
