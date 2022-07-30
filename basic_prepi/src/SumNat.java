import java.util.Scanner;

public class SumNat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int num1 = n; num1 >0; num1--){
            System.out.print(num1 +" ");
        }
    }
}
