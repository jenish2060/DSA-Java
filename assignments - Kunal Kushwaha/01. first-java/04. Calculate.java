// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two number : ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        System.out.println("Enter an operator ( +, -, *, / ) :" );
        char operator = input.next().charAt(0);
        if(operator == '+'){
            System.out.println("Sum : " + (num1+num2));
        }
        else if(operator == '-'){
            System.out.println("Difference : " + (num1-num2));
        }
        else if(operator == '*'){
            System.out.println("Product : " + (num1*num2));
        }
        else if(operator == '/'){
            if (num2 != 0) {
                System.out.println("Division : " + (num1 / num2));
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
