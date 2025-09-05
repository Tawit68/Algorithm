import java.util.Scanner;
public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Num1:");
        int integer = scanner.nextInt();

        if (integer % 2 == 0) {
            System.out.println("เป็นจำนวนคู่");
        } else {
            System.out.println("เป็นจำนวนคี่");
        }

        scanner.close();
    }
}