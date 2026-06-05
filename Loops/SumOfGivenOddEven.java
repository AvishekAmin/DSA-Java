package Loops;

import java.util.Scanner;

public class SumOfGivenOddEven {
    public static void main(String[] args) {

        int oddSum = 0, evenSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " integers: ");
        for(int count=1; count<=n; count++) {
            int num = sc.nextInt();
            if(num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        sc.close();

        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
