import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int a = input.nextInt();
        int perimeter = 4 * a;
        System.out.println("The perimeter of rhombus is : "+ perimeter);
    }
}
