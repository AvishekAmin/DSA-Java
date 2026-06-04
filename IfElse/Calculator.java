package IfElse;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+' :
                System.out.print("Addition: " + (a + b));
                break;

            case '-' :
                System.out.print("Subtraction: " + (a - b));
                break;
        
            case '*' :
                System.out.print("Multiplication: " + (a * b));
                break;
        
            case '/' :
                System.out.println("Division: " + (a / b));
                break;
        
            case '%' :
                System.out.print("Remainder: " + (a % b));
                break;
        
            default :
                System.out.print("Wrong Input. Please try again.");
        }
        sc.close();
    }
}
