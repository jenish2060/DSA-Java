// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age ? ");
        int age = input.nextInt();
        checkEligibility(age);
    }

    static void checkEligibility(int age){
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
}
