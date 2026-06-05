package Patterns.HollowStarPyramid;

import java.util.Scanner;

public class HollowStarPyramidReverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1; j++) {
                if(i == 1 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int j=1; j<=n-i; j++) {
                if(i == 1 || j == n-i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
