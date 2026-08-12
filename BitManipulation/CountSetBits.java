package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if((n & 1) != 0) {      // Check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Answer: " + countSetBits(n));
    }
}
