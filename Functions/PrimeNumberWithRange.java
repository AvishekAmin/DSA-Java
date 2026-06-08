package Functions;

import java.util.Scanner;

public class PrimeNumberWithRange {
    
    public static boolean isPrime(int n) {

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if(isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
