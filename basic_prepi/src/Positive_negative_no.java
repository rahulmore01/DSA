import java.util.Scanner;

public class Positive_negative_no {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number: ");
        double num = input.nextDouble();

        if (num < 0){
            System.out.println("Number is negative");
        }
        else if (num > 0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is not positive nor negative its a zero");
        }
    }
}
