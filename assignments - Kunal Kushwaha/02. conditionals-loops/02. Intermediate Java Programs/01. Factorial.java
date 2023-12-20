// Factorial Program

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int fact = 1;
        if(num==0 || num ==1){
            System.out.println("The factorial of " + num + " is "+ fact);
        }
        else {
            for (int i = 2; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of " + num + " is "+ fact);
        }

    }
}
