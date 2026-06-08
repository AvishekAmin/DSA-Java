package Functions;

import java.util.Scanner;

public class DecimalToBinary {
    public static int DecToBin(int dec) {
        int bin = 0, pow = 0;
        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        return bin;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Binary number of " + n + " is: " + DecToBin(n));
    }
}
