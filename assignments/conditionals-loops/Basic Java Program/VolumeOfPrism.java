import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = input.nextInt();
        System.out.println("Enter the height : ");
        int height = input.nextInt();
        int volume = base * height;
        System.out.println("The volume of prism is : "+ volume);
    }
}
