package Arrays.Arrays1D;

import java.util.Scanner;

public class PassByReference {
    public static void update(int marks[]) {
        for (int i=0; i<marks.length; i++) {
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        System.out.print("Enter marks in maths: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter marks in physics: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter marks in chemistry: ");
        marks[2] = sc.nextInt();
        sc.close();

        System.out.print("Before updatation: ");
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.print("After updatation: ");
        update(marks);
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
