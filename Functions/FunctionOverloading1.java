package Functions;

import java.util.Scanner;

public class FunctionOverloading1 {

    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you want to add?\nEnter 2 or 3: ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.print("Enter 2 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Sum of " + a + " and " + b + " is: " + sum(a, b));
        } else if (n == 3) {
            System.out.print("Enter 3 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.print("Sum of " + a + ", " + b + " and " + c + " is: " + sum(a, b, c));
        } else {
            System.out.print("Invalid input!");
        }
        sc.close();
    }
}
