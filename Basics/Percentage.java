package Basics;

import java.util.Scanner;

public class Percentage {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks in Maths: ");
        float math = sc.nextInt();
        System.out.print("Enter Marks in Com. Science: ");
        float cs = sc.nextInt();
        System.out.print("Enter Marks in Physics: ");
        float phy = sc.nextInt();
        System.out.print("Enter Marks in Chemistry: ");
        float chem = sc.nextInt();
        System.out.print("Enter Marks in English: ");
        float eng = sc.nextInt();
        System.out.print("Enter maximum marks: ");
        float max = sc.nextInt();
        sc.close();
        float p = (math + cs + phy + chem + eng) / max * 100;
        System.out.print("Percentage: " + p);
    }
}
