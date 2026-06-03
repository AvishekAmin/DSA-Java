package Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter 1st number");
        float a = sc.nextFloat();

        System.out.println("Enter 2nd number:");
        float b = sc.nextFloat();

        sc.close();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}
