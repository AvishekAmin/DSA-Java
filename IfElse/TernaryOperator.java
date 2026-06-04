package IfElse;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String OddEven = (n % 2 == 0) ? (n + " is even") : (n + " is odd");
        System.out.println(OddEven);
        sc.close();
    }
}
