package Patterns;

import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
