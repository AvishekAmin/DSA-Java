package Loops;

import java.util.Scanner;

public class LoopsBasics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // For Loop
        for (int count = 1; count <= num; count++) {
            System.out.print(count + " ");
        }
        sc.close();

        // While Loop      
        // int count = 1;
        // while (count <= num) {
        //     System.out.print(count + " ");
        //     count++;
        // }

        // Do-While Loop
        // int count = 1;
        // do {
        //     System.out.print(count + " ");
        //     count++;
        // } while (count <= num);
    }
}
