package Functions;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {

        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("Factorial of " + n + " is: " + factorial(n));
    }
}
