package Patterns.AlphabetTriangle;

import java.util.Scanner;

public class AlphabetTriangleReverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern: ");
        for(int i=1; i<=n; i++) {

            char ch = (char)('A' + i - 1);
            
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
