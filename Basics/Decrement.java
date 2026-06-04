package Basics;

public class Decrement {
    public static void main(String[] args) {
        // Pre Decrement -> --a
        int a = 10;
        int b = --a;
        System.out.println(a);
        System.out.println(b);

        // Post Decrement -> a--
        int c = 10;
        int d = c--;
        System.out.println(c);
        System.out.println(d);
    }
}
