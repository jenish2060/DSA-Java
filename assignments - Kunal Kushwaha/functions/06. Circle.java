// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.


import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = input.nextInt();
        double circumference = circumference(radius);
        System.out.printf("Circumference of a circle : %.2f%n", circumference);
        double area = area(radius);
        System.out.printf("Area of a circle : %.2f%n", area);
    }

    static double circumference(int r){
        return (2 * Math.PI * r);
    }

    static double area(int r){
        return (Math.PI * Math.pow(r,2));
    }
}
