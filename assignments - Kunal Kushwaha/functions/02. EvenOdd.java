// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ( > 0 ) : ");
        int num = input.nextInt();
        evenOdd(num);
    }

    static void evenOdd(int num){
        if(num == 0){
            System.out.println("Neither even nor odd.");
        }
        else if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        }
        else{
            System.out.println(num + " is a odd number");
        }
    }
}
