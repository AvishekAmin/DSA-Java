package BitManipulation;

import java.util.Scanner;

public class GetIthBit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        System.out.print("Enter i value: ");
        int i = sc.nextInt();
        sc.close();
        System.out.println("Answer: " + getIthBit(n, i));
    }
}
