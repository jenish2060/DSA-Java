// Find if a number is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();
        int temp=num, numTemp, reverse = 0;
        while(num!=0){
            numTemp = num % 10;
            reverse = reverse * 10 + numTemp;
            num = num / 10;
        }
        if(temp == reverse){
            System.out.println(reverse + " is palindrome");
        }
        else{
            System.out.println(reverse + " is not a palindrome");
        }
    }
}
