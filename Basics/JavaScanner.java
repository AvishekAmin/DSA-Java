package Basics;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // To print a word 
        System.out.println("Enter a word: ");
        String word = sc.next();
        sc.close();
        System.out.println("The word you entered: " + word);

        // To print a line or a paragraph
        // System.out.println("Enter your full name: ");
        // String name = sc.nextLine();
        // sc.close();
        // System.out.println("Your name: " + name);
    
        // To print an integer
        // System.out.print("Enter an integer: ");
        // int n = sc.nextInt();
        // sc.close();
        // System.out.print("The integer you entered: " + n);
    
        // To print a float
        // System.out.print("Enter an float: ");
        // float price = sc.nextFloat();
        // sc.close();
        // System.out.print("The float you entered: " + price);
    }
}
