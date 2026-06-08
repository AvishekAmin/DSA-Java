package Functions;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int prev = n;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        if (prev == rev) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if (isPalindrome(n)) {
            System.out.print(n + " is a palindrome number");
        } else {
            System.out.print(n + " is not a palindrome number");
        }
    }
}
