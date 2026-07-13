package Strings;

import java.util.Scanner;

public class PrintLargestString {
    public static String getLargest(String fruits[]) {
        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of fruits: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String fruits[] = new String[n];
        System.out.println("Enter name of " + n + " fruits: ");
        for(int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.next();
        }
        sc.close();

        System.out.println("Largest string is: " + getLargest(fruits));
    }
}
