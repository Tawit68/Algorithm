import java.util.Scanner;

public class Notechange {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter pay ");
        int pay = sc.nextInt();

        int change = 1000-pay;
        System.out.println("Change is : " + change + "Banth");

        int fiveHundredNote = change/500;
        change = change%500;

        int hundredNote = change/100;
        change = change%100;

        int fiftyNote = change/50;
        change = change%50;

        int twentyNote = change/20;
        change = change%20;

        int tenCoins = change/10;
        change = change%10;

        int fiveCoins = change/5;
        change = change%5;

        int twoCoins = change/2;
        change = change%2;

        int oneCoins = change/1;
        change = change%1;

        System.out.println("Five-hundred note: " + fiveHundredNote + "Bath");
        System.out.println("Hundred note: " + hundredNote + "Bath");
        System.out.println("Fifty note: " + fiftyNote + "Bath");
        System.out.println("Twenty note: " + twentyNote + "Bath");
        System.out.println("Ten coins: " + tenCoins + "Bath");
        System.out.println("Five conis: " + fiveCoins + "Bath");
        System.out.println("Two coins: " + twoCoins + "Bath");
        System.out.println("One coins: " + oneCoins + "Bath");
    }
}