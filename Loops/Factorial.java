package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        int fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=2; i<=n; i++) {
            fact = fact * i;
        }

        System.out.print("Factorial of " + n + " is: " + fact);
    }
}
