//programme to print 1st N natural numbers in reverse order.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int num1 = n; num1 >0; num1--){
            System.out.print(num1 +" ");
        }
    }
}