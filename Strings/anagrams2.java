package Strings;

import java.util.*;

public class anagrams2 {
    public static boolean checkAnagrams(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            return result;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2 = sc.nextLine();
        sc.close();

        if(checkAnagrams(str1, str2) == true) {
            System.out.print("Strings are anagrams of each other");
        } else {
            System.out.print("Strings are not anagrams of each other");
        }
    }
}