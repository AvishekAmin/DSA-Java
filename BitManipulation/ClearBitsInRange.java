package BitManipulation;

import java.util.Scanner;

public class ClearBitsInRange {
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter i value: ");
        int i = sc.nextInt();
        System.out.print("Enter j value: ");
        int j = sc.nextInt();
        sc.close();
        System.out.println("Answer: " + clearBitsInRange(n, i, j));
    }
}
