package BitManipulation;

import java.util.Scanner;

public class Add1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(n + " + " + 1 + " is " + -~n);
    }
}