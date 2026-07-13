package Strings;

import java.util.Scanner;

public class Substring {
    public static String printSubstring(String str, int si, int ei) {
        String subStr = "";
        for(int i = si; i < ei + 1; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter starting index and ending index: ");
        int si = sc.nextInt();
        int ei = sc.nextInt();
        sc.close();

        // Inbuilt function
        // System.out.println("Substring with starting index " + si + " and ending index " + ei + " is: " + str.substring(3,8));

        String subStr = printSubstring(str, si, ei);
        System.out.println("Substring with starting index " + si + " and ending index " + ei + " is: " + subStr);
    }
}
