// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        int num = input.nextInt();
        int a = 0 , b = 1 ,c;
        String newline = System.lineSeparator();
        System.out.println(a + newline + b );
        int count = 0;
        while(count != num-2){
            c = a+b;
            System.out.println( c );
            a = b;
            b = c;
            count++;
        }
    }
}
