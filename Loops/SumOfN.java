package Loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // For Loop
        int sum = 0;
        for (int count = 1; count <= num; count++) {
            sum += count;
        }
        System.out.println("Sum of first " + num + " natural numbers: " + sum);

        // While Loop
        // int count = 1;
        // int sum = 0;
        // while (count <= num) {
        //     sum += count;
        //     count++;
        // }
        // System.out.println("Sum of first " + num + " natural numbers: " + sum);

        // Do-While Loop
        // int count = 1;
        // int sum = 0;
        // do {
        //     sum += count;
        //     count++;
        // } while (count <= num);
        // System.out.println("Sum of first " + num + " natural numbers: " + sum);

        sc.close();
    }
}
