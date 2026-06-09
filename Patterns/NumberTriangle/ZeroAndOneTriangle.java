package Patterns.NumberTriangle;

import java.util.Scanner;

public class ZeroAndOneTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                } 
            }
            System.out.println();
        }
    }
}
