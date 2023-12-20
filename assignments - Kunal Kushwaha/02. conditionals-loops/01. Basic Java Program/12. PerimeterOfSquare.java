// Perimeter of Square

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side : ");
        int a = input.nextInt();
        int perimeter = 4 * a;
        System.out.println("The perimeter of square is " + perimeter);
    }
}
