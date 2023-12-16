// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int temp, product=1, sum=0;
        while(num!=0){
            temp = num % 10;
            product = temp * product;
            sum = temp + sum;
            num = num / 10;
        }
        int result = product - sum;
        System.out.println("Product :"+ product);
        System.out.println("Sum : "+ sum);
        System.out.println("The result is : " + result);
    }
}
