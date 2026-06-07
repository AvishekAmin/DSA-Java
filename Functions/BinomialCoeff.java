package Functions;

import java.util.Scanner;

public class BinomialCoeff {

    public static int factorial(int n) {

        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binomial(int n, int r) {

        int binomial = factorial(n) / (factorial(r) * factorial(n-r));
        return binomial;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        sc.close();

        System.out.print(n + " C " + r + " is: " + binomial(n,r));
    }
}
