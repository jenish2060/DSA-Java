import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius :");
        int radius = input.nextInt();
        System.out.println("Enter the height :");
        int height = input.nextInt();
        DecimalFormat df = new DecimalFormat("#.###");
        double volume = Math.PI * Math.pow(radius,2) * height/3;
        System.out.println("The volume of cone is : "+ df.format(volume));
    }
}
