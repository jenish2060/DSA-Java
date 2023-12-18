// Vowel or Consonant

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet : ");
        char alphabet = input.next().charAt(0);
        if((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')){
            switch (alphabet){
                case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println(alphabet + " is a vowel");
                default -> System.out.println(alphabet + " is a consonant");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
