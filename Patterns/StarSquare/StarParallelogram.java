package Patterns.StarSquare;

import java.util.Scanner;

public class StarParallelogram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
