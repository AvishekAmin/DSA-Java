package BitManipulation;

import java.util.Scanner;

public class FastExponentiation {
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) {      // Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print(a + " to the power " + n + " is: " + fastExpo(a, n));
    }
}
