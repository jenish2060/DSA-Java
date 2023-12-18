// LCM of two numbers

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number : ");
        int secondNum = input.nextInt();

        int largestNumber = Math.max(firstNum,secondNum);
        int lcm = largestNumber;

        while(true){
            if (lcm % firstNum == 0 && lcm % secondNum == 0){
                break;
            }
            lcm += largestNumber;
        }
        System.out.println("LCM of " + firstNum + " and " + secondNum + " : " + lcm);

    }
}
