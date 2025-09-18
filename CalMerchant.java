import java.util.Scanner;

public class CalMerchant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the price of the product (per unit): ");
        double pricePerUnit = sc.nextDouble();

        System.out.print("Enter the quantity of the product: ");
        int quantity = sc.nextInt();

        double totalPrice = pricePerUnit * quantity;

        if (quantity >= 10) {
            totalPrice = totalPrice * 0.9; 
            System.out.println("You get a 10% discount!");
        }

        System.out.println("Total price: " + totalPrice + " Baht");
    }
}