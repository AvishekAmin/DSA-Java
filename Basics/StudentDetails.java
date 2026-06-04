package Basics;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String Name = sc.nextLine();
        System.out.println("Enter your college name: ");
        String College = sc.nextLine();
        System.out.println("Enter your Branch: ");
        String Branch = sc.nextLine();
        System.out.println("Enter your semester: ");
        String Semester = sc.nextLine();
        System.out.println("Enter your section: ");
        String Section = sc.next();
        System.out.println("Enter your class roll: ");
        int Roll = sc.nextInt();
        sc.close();
        System.out.println("\nYour Data ->");
        System.out.println(Name);
        System.out.println(College);
        System.out.println(Branch);
        System.out.println(Semester);
        System.out.println(Section);
        System.out.println(Roll);
    }
}
