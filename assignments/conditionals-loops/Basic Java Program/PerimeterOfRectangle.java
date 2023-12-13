import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = input.nextInt();
        System.out.println("Enter the breadth : ");
        int breadth = input.nextInt();
        int perimeter = 2*(length+breadth);
        System.out.println("The perimeter of rectangle is : "+ perimeter);
    }
}
