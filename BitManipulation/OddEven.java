package BitManipulation;

import java.util.Scanner;

public class OddEven {
    public static void oddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        oddEven(n);
    }
}
