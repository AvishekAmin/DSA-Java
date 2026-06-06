package Patterns.NumberSquare;

import java.util.Scanner;

public class NumberSquareX {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int num = 1;
        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
