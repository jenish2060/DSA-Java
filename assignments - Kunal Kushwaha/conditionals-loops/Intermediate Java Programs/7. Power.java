// Power in Java

import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = input.nextInt();

        System.out.println("Enter the power value :");
        int power = input.nextInt();

        double result = Math.pow(num,power);
        System.out.println("The result is : " + result);
    }
}
