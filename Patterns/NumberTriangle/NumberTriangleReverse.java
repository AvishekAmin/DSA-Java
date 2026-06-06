package Patterns.NumberTriangle;

import java.util.Scanner;

public class NumberTriangleReverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            int k = i;
            for(int j=1; j<=i; j++) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }
    }
}
