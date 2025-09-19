import java.util.Scanner;

public class Age  {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if (age > 10) {
            System.out.println("Take 2 tespoons");
        } else if (age > 3) {
            System.out.println("Take 1 teaspoon");
        } else if (age > 1) {
            System.out.println("Take 1/2 teasppon");
        } else {
            System.out.println("Do not take medicine") ;
        }
    }
}