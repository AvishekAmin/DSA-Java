package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        float c = 25.99f;
        int d = (int)c;     //Typecasting
        System.out.println(d);

        char ch = 'A';
        int n = ch;         //ASCII value of A is 65
        System.out.println(n);

        char a = 'a';   //a = 97
        char b = 'b';   //b = 98
        int x = a + b;
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a);
        System.out.println(b-a);
        System.out.println(x);
        sc.close();
    }
}
