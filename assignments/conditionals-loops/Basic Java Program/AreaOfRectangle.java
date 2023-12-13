import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length : ");
        float length = input.nextInt();
        System.out.println("Enter the breadth : ");
        float breadth = input.nextInt();
        float area = length * breadth;
        System.out.println("The area of rectangle is : "+ area);
    }
}
