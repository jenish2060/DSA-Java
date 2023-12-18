// HCF of two numbers

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number : ");
        int secondNum = input.nextInt();

        int smallerNumber = Math.min(firstNum,secondNum);
        int hcf = 1;
        for (int i = 1 ; i <= smallerNumber ; i++) {
            if( firstNum % i == 0 && secondNum % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF of "+ firstNum + " and " + secondNum + " : " + hcf);
    }
}
