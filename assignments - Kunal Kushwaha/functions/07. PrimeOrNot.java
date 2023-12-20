// Define a method to find out if a number is prime or not.

import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        checkPrime(num);
    }

    static void checkPrime(int num){
        if(num<=1){
            System.out.println("Number greater than 1 required.");
        }
        int count = 2;
        for (int i = count; i < num ; i++) {
            if(num % (count*count) == 0){
                System.out.println(num + " is not a prime number");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }
}
