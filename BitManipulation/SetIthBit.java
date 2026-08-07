package BitManipulation;

import java.util.Scanner;

public class SetIthBit {
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        System.out.print("Enter i value: ");
        int i = sc.nextInt();
        sc.close();
        System.out.println("Answer: " + setIthBit(n, i));
    }
}
