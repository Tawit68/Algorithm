import java.util.Scanner;

public class temperature {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Temperature : ");
        double temperature = sc.nextDouble();

        if (temperature < 20) {
        System.out.println("Temperature " + temperature + " C ");
        System.out.println("Status : Cold");
        }else if(temperature >=20 && temperature <= 35) {
            System.out.println("Temperature " + temperature + " C ");
            System.out.println("Status : Normal");
        }else {
            System.out.println("Temperature " + temperature + " C ");
            System.out.println("Status : Hot");
        }
    }
}