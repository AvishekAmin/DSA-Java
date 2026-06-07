package Functions;

import java.util.Scanner;

public class Swap {
    public static void swap(int a, int b) {
        
        int temp = a;
        a = b;
        b = temp;
        System.out.print("After swapping ->\n1st number: " + a + "\n2nd number: " + b);
        return;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        sc.close();

        swap(a, b);
    }
}
