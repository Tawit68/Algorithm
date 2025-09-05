import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to calculate the area of a triangle");
        System.out.println("Enter 2 to calculate BMI");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the base of the triangle: ");
            double base = sc.nextDouble();

            System.out.print("Enter the height of the triangle: ");
            double height = sc.nextDouble();

            double area = 0.5 * base * height;
            System.out.println("Area of the triangle: " + area + " square units");
        } else if (choice == 2) {
            System.out.print("Enter your weight in kilograms: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();

            double BMI = weight / (height * height);
            System.out.println("Your BMI for weight = " + weight + " kg and height = " + height + " meters is: " + BMI);
        } else {
            System.out.println("Invalid choice!");
        }

    }
}