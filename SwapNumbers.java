import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();

        System.out.println("\nCurrent -> number1 = " + number1 + " and number2 = " + number2);
   
        System.out.println("\nSwapping ");
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("\nNow -> number1 = " + number1 + " and number2 = " + number2);
    }
}