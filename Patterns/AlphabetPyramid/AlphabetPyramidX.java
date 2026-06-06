package Patterns.AlphabetPyramid;

import java.util.Scanner;

public class AlphabetPyramidX {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        char ch = (int)65;

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
