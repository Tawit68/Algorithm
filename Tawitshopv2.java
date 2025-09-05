import java.util.Scanner;

public class Tawitshopv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name1: ");
        String product1 = sc.nextLine();
        System.out.print("Enter price product1: ");
        double price1 = sc.nextDouble();
        System.out.print("Enter quantity for product 1: ");
        double quantity1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Product Name2: ");
        String product2 = sc.nextLine();
        System.out.print("Enter price product2: ");
        double price2 = sc.nextDouble();
        System.out.print("Enter quantity for product 2: ");
        double quantity2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Product Name3: ");
        String product3 = sc.nextLine();
        System.out.print("Enter price product3: ");
        double price3 = sc.nextDouble();
        System.out.print("Enter quantity for product 3: ");
        double quantity3 = sc.nextDouble();

        System.out.print("Customer Paid Money: ");
        double costumer_paid = sc.nextDouble();

        double netprice_pen = price1 * quantity1;
        double netprice_pencil = price2 * quantity2;
        double netprice_book = price3 * quantity3;

        double subtotal = netprice_pen + netprice_pencil + netprice_book;
        double vat = subtotal * 0.07;
        double total_including_vat = subtotal + vat;
        double amout_paid = costumer_paid;
        double change = amout_paid - total_including_vat;

        System.out.printf("%s : %.2f x %.0f = %.2f Bath%n", product1, price1, quantity1, netprice_pen);
        System.out.printf("%s : %.2f x %.0f = %.2f Bath%n", product2, price2, quantity2, netprice_pencil);
        System.out.printf("%s : %.2f x %.0f = %.2f Bath%n", product3, price3, quantity3, netprice_book);
        System.out.printf("Subtotal: %.2f Bath%n", subtotal);
        System.out.printf("VAT 7%% : %.2f Bath%n", vat);
        System.out.printf("Total including VAT: %.2f Bath%n", total_including_vat);
        System.out.printf("Amount paid: %.2f Bath%n", amout_paid);
        System.out.printf("Change: %.2f Bath%n", change);

        sc.close();
    }
}