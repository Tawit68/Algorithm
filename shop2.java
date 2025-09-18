import java.util.Scanner;

public class shop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter price product: ");
        int price1 = sc.nextInt();
        System.out.print("Enter quantity for product : ");
        int quantity1 = sc.nextInt();

        System.out.print("Enter price product: ");
        int price2 = sc.nextInt();
        System.out.print("Enter quantity for product : ");
        int quantity2 = sc.nextInt();

        System.out.print("Enter price product: ");
        int price3 = sc.nextInt();
        System.out.print("Enter quantity for product : ");
        int quantity3 = sc.nextInt();

        System.out.print("Enter price product: ");
        int price4 = sc.nextInt();
        System.out.print("Enter quantity for product : ");
        int quantity4 = sc.nextInt();

        int total = price1 * quantity1 + price2 * quantity2 + price3 * quantity3 + price4 * quantity4;
        System.out.println("Total Product price: " + total + " Bath ");
        

        System.out.print("Enter pay: ");
        int pay = sc.nextInt();
        

        if (pay < total) { System.out.println("Not enough money!!");
            
        }  else{
            int change = pay - total;
            System.out.println("Change : " + change + " Bath");
        }
    }
}