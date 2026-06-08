package Functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int BinToDec(int bin) {
        int dec = 0, pow = 0;
        while (bin > 0) {
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        return dec;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Decimal number of " + n + " is: " + BinToDec(n));
    }
}
