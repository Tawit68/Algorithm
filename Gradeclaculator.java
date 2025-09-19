import java.util.Scanner;

public class Gradeclaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter score : ");
        int score = sc.nextInt();

        if (score < 0 || score > 100 ){
            System.out.print("Do not enter a score less than 0 or more than 100");
        }else {

            if (score >= 80){
                System.out.print("Grade : A");
            } else if (score >= 70) {
                System.out.print("Grade : B");
            } else if (score >= 60) {
                System.out.print("Grade : C");
            } else if (score >= 50) {
                System.out.print("Grade : D");
            }else{
                System.out.print("Grade : E");
            } 
        }
    }
}
