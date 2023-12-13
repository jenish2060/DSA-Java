import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base : ");
        float base = input.nextInt();
        System.out.println("Enter the height : ");
        float height = input.nextInt();
        float area = (base * height)/2 ;
        System.out.println("The area of triangle is : "+ area);
    }
}
