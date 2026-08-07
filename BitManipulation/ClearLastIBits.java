package BitManipulation;

import java.util.Scanner;

public class ClearLastIBits {
    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        System.out.print("Enter i value: ");
        int i = sc.nextInt();
        sc.close();
        System.out.println("Answer: " + clearLastIBits(n, i));
    }
}
