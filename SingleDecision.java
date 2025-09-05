import java.util.Scanner;

public class SingleDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Num1:");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("จํานวนเต็มบวก");
        }
        
        System.out.println("จบโปรเเกรม");
    }
}