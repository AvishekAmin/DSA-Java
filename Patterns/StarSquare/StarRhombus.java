package Patterns.StarSquare;

import java.util.Scanner;

public class StarRhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
