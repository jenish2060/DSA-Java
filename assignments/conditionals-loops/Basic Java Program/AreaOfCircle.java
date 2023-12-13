import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the area of circle : ");
        float radius = input.nextFloat();
        double area = Math.PI * Math.pow(radius,2);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("The area of circle is : " + df.format(area));
    }
}
