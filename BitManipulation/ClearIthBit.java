package BitManipulation;

import java.util.Scanner;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter i value: ");
        int i = sc.nextInt();
        sc.close();
        System.out.println("Answer: " + clearIthBit(n, i));
    }
}
