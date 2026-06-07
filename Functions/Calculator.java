package Functions;

import java.util.Scanner;

public class Calculator {

    public static float Addition(float a, float b) {
        return a+b;
    }
    public static float Subtraction(float a, float b) {
        return a-b;
    }
    public static float Multiplication(float a, float b) {
        return a*b;
    }
    public static float Division(float a, float b) {
        return a/b;
    }
    public static float Modulus(float a, float b) {
        return a%b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd number: ");
        float b = sc.nextFloat();
        System.out.print("Enter any character ->\nE.g. +, -, *, /, % : ");
        char ch = sc.next().charAt(0);
        sc.close();

        switch (ch) {
            case '+' :
                System.out.print("Addition: " + Addition(a, b));
                break;
            case '-' :
                System.out.print("Subtraction: " + Subtraction(a, b));
                break;     
            case '*' :
                System.out.print("Multiplication: " + Multiplication(a, b));
                break;     
            case '/':
                if (b == 0) {
                    System.out.print("Division by zero is not allowed");
                } else {
                    System.out.print("Division: " + Division(a, b));
                }
                break;     
            case '%' :
                if (b == 0) {
                    System.out.print("Division by zero is not allowed");
                } else {
                    System.out.print("Remainder: " + Modulus(a, b));
                }
                break;
            default :
                System.out.print("Wrong Input! Please enter valid operator");
        }
    }
}
