package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {

        // Strings are immutable
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("abc@123");

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        sc.close();
        System.out.println("Your name is: " + name);
        System.out.println("Length of name string is: " + name.length());

        // concatenation
        String firstName = "Rohit";
        String middleName = "Gurunath";
        String lastName = "Sharma";
        String fullName = firstName + " " + middleName + " " +  lastName;
        System.out.println("Full name is: " + fullName);

        // print characters at a specific position
        printLetters(fullName);
    }
}
