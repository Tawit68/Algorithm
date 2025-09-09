import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        double midterm = sc.nextDouble();

        System.out.print("Enter your finalscore score: ");
        double finalscore = sc.nextDouble();

        double total = midterm + finalscore;

        if (total < 50){
            System.out.println("Your total score is " + total + " The result is Fail!!" );

        } else if (total >= 50 && total < 100) {
            System.out.println("Your total score is " + total + " The result is Pass!! ");
        } else {
            System.out.println("You have overscored!!");
        }
    }
}
