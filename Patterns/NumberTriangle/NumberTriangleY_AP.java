package Patterns.NumberTriangle;

import java.util.Scanner;

public class NumberTriangleY_AP {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            int k=1;
            for(int j=1; j<=i; j++) {
                System.out.print(k + " ");
                k+=2;
            }
            System.out.println();
        }
    }
}
