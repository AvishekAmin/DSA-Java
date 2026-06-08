package Functions;

import java.util.Scanner;

public class FunctionOverloading2 {

    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Which data type you want to add?\nEnter 1 for int or 2 for float: ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.print("Enter 2 int numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Sum of " + a + " and " + b + " is: " + sum(a, b));
        } else if (n == 2) {
            System.out.print("Enter 2 float numbers: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            System.out.print("Sum of " + a + " and " + b + " is: " + sum(a, b));
        } else {
            System.out.print("Invalid input!");
        }
        sc.close();
    }
}
