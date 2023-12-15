// Area of Parallelogram

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = input.nextInt();
        System.out.println("Enter the height : ");
        int height = input.nextInt();
        int area = base * height;
        System.out.println("The area of parallelogram is : "+ area);
    }
}
