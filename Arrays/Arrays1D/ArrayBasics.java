package Arrays.Arrays1D;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        // int numbers[] = {1, 2, 3};
        // char characters[] = {'A', 'B', 'C'};
        // String fruits[] = {"Apple", "Mango", "Orange"};

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        System.out.print("Enter marks in maths: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter marks in physics: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter marks in chemistry: ");
        marks[2] = sc.nextInt();
        sc.close();

        System.out.println("Length of array " + marks.length);

        System.out.println("Maths: " + marks[0]);
        System.out.println("Physics: " + marks[1]);
        System.out.println("Chemistry(Before): " + marks[2]);

        marks[2] = marks[2] + 1; // Added 1 marks extra
        System.out.println("Chemistry(After): " + marks[2]);
    }
}
