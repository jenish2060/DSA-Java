// Reverse a String

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String data = input.nextLine();
        String reverse = "";
        char temp;
        for (int i=0; i<data.length(); i++){
            temp = data.charAt(i);
            reverse = temp + reverse;
        }
        System.out.println("The reverse of string is : " + reverse);

        // Using StringBuilder
        StringBuilder reverseBuilder = new StringBuilder();
        reverseBuilder.append(data);
        reverseBuilder.reverse();
        String reverseSecond = reverseBuilder.toString();
        System.out.println("The reverse of string is : " + reverseSecond);

    }
}
