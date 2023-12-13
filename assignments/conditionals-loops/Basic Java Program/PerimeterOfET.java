import java.util.Scanner;

public class PerimeterOfET {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of side : ");
        int a = input.nextInt();
        int perimeter = 3 * a;
        System.out.println("The perimeter of equilateral triangle is : "+ perimeter);
    }
}
