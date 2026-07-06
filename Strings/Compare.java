package Strings;

public class Compare {
    public static void main(String[] args) {
        String s1 = "Avishek";
        String s2 = "Avishek";
        String s3 = new String("Avishek");

        if(s1 == s2) {      // Points the same string
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(s1 == s3) {      // Creates a new String at a different location
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)) {     // Only checks the value
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
