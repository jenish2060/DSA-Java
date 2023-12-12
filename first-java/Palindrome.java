// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String data = input.next();
        StringBuilder data2 = new StringBuilder();
        data2.append(data);
        data2.reverse();
        String rev = data2.toString();
        if(data.equals(rev)){
            System.out.println(data + " is Palindrome.");
        }
        else{
            System.out.println(data + " is not Palindrome.");
        }
    }
}
