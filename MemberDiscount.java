import java.util.Scanner;

public class MemberDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter membership level (Silver, Gold, Platinum, Other): ");
        String membership = sc.nextLine();

        System.out.print("Enter total purchase amount: ");
        double purchase = sc.nextDouble();

        double discountRate = 0;

        if (membership.equalsIgnoreCase("Silver")) {
            discountRate = 0.05;
        } else if (membership.equalsIgnoreCase("Gold")) {
            discountRate = 0.10;
        } else if (membership.equalsIgnoreCase("Platinum")) {
            discountRate = 0.15;
        } else {
            discountRate = 0.00;  
        }

        double discount = purchase * discountRate;
        double netAmount = purchase - discount;

        System.out.println("Membership Level: " + membership);
        System.out.println("Total Purchase : " + purchase);
        System.out.println("Discount Amount : " + discount);
        System.out.println("Final price : " + netAmount);
    }
}