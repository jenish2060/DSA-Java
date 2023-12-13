import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base : ");
        float base = input.nextInt();
        System.out.println("Enter the height : ");
        float height = input.nextInt();
        float area = (base * height)/2 ;
        System.out.println("The area of isosceles triangle is : "+ area);
    }
}
