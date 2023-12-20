import java.util.Scanner;

public class CheckFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        long factorial = Factorial(num);
        System.out.println("Factorial: " + factorial);
    }

    static long Factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
