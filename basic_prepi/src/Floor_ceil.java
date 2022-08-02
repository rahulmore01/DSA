import java.util.Scanner;
import java.math.RoundingMode;
public class Floor_ceil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("enter your number : ");

        System.out.println(Math.round(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));

    }
}
