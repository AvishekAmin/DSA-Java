package BitManipulation;

import java.util.Scanner;

public class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(n + " + " + 1 + " is " + -~n);
    }
}