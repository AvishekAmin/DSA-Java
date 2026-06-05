package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime == true) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.print(n + " is not a prime number");
        }
    }
}
