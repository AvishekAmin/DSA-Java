package Strings;

import java.util.*;

public class Anagrams {
    public static boolean checkAnagrams(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int count = 0;

        if (str1.length() != str2.length()) {
            return false;
        } else {
            boolean visited[] = new boolean[str1.length()];

            for(int i = 0; i < str1.length(); i++) {
                for(int j = 0; j < str2.length(); j++) {

                    if(!visited[j] && str1.charAt(i) == str2.charAt(j)) {
                        visited[j] = true;
                        count++;
                        break;
                    }
                }
            }
        }

        if(count == str1.length()) {
            return true;
        } else {
            return false;
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
