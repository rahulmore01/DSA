import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your value to check wheather it's Odd or Even: ");

//        we used "double" so that we can take decimal no like 13.4 as input.

        double num = input.nextDouble();

        if (num % 2 == 0) {
            System.out.println("Entered number is EVEN");
        }

        else {
            System.out.println("Entered number is ODD");
        }
    }
}