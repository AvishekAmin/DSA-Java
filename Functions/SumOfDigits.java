package Functions;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Sum of digits of " + n + " is: " + sumOfDigits(n));
    }
}
