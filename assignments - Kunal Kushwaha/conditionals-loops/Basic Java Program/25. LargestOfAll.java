// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, max=0;
        System.out.println("Enter the integers to find the largest among them : ");
        while(true){
            num = input.nextInt();
            if(num==0){
                break;
            }
            if(num>max){
                max = num;
            }
        }
        System.out.println("The largest number is : "+ max);
    }
}
