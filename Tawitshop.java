import java.util.Scanner;

public class Tawitshop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Product Name1; ");
        String product1 = sc.nextLine();
        sc.nextLine();

        System.out.print("price product1: ");
        double price1 = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Product Name2; ");
        String product2 = sc.nextLine();
        sc.nextLine();

        System.out.print("price product1: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Product Name2 ");
        String product2= sc.nextLine();
        sc.nextLine();

        System.out.print("price product3: ");
        double price3 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Costumer Paid Money ");
        double costumer_paid = sc.nextDouble();

        double total_price = printproduct1 + printproduct2 + printproduct3
        double vat = total_price * 0.07
        double net_price = total_price + vat;
        double total_price =costumer_paid;
        double change = total_price - net_price;

        System.out.println("Product Name: " + product1 + "Price" + printproduct1);
        System.out.println("Product Name: " + product2 + "Price" + printproduct2);
        System.out.println("Product Name: " + product3 + "Price" + printproduct3);
        System.out.println

    }
}