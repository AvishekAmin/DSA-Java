package Loops;

import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int oddSum = 0, evenSum = 0;
        for (int count = 1; count <= num; count++) {
            if(count % 2 == 0) {
                evenSum += count;
            } else {
                oddSum += count;
            }
        }
        System.out.println("Sum of first " + num + " odd natural numbers: " + oddSum);
        System.out.println("Sum of first " + num + " even natural numbers: " + evenSum);
    }
}
