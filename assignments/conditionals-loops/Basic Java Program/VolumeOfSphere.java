import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = input.nextInt();
        double volume = 4.0/3.0 * Math.PI * Math.pow(radius,3);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("The volume of sphere is : "+ df.format(volume));
    }
}
