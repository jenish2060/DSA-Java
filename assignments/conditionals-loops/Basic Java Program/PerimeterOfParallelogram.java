import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side A : ");
        int a = input.nextInt();
        System.out.println("Enter the side B : ");
        int b = input.nextInt();
        int perimeter = 2*(a+b);
        System.out.println("The perimeter of parallelogram is : "+ perimeter);
    }
}
