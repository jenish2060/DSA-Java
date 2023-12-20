// Area of Rhombus

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of both diagonals : ");
        int p = input.nextInt();
        int q = input.nextInt();
        int area = (p*q)/2;
        System.out.println("The area of parallelogram is : "+ area);
    }
}
