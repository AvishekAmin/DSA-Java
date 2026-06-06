package Patterns.NumberTriangle;

import java.util.Scanner;

public class NumberTriangleAP {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int num = 1;
        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num+=2;
            }
            System.out.println();
        }
    }
}
