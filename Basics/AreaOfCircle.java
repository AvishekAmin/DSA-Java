package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r = sc.nextFloat();
        sc.close();

        float area = 3.14159f * r * r;
        System.out.println("Area of circle with radius " + r + " is: " + area);

    }
}