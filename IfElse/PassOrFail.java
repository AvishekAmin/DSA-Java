package IfElse;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        String PassOrFail = (marks >= 33) ? ("Passed") : ("Failed");
        System.out.println(PassOrFail);
        sc.close();
    }
}
