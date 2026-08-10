package BitManipulation;

import java.util.Scanner;

public class Add1 {
    public static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + " b = " + b);
        // Swap using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        swap(a, b);
        sc.close();
    }
}
