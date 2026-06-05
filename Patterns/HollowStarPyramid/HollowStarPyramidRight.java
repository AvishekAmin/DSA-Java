package Patterns.HollowStarPyramid;

import java.util.Scanner;

public class HollowStarPyramidRight {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                if(j == 1 || j == n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
