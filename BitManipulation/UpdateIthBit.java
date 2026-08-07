package BitManipulation;

import java.util.Scanner;

public class UpdateIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        System.out.print("Enter i value: ");
        int i = sc.nextInt();
        System.out.print("Enter new bit value: ");
        int newBit = sc.nextInt();
        sc.close();
        System.out.println("Answer: " + updateIthBit(n, i, newBit));
    }
}
