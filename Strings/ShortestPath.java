package Strings;

import java.util.Scanner;

public class ShortestPath {
    public static float shortestPath(String str) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'N') {
                y++;
            } else if(str.charAt(i) == 'S') {
                y--;
            } else if(str.charAt(i) == 'E') {
                x++;
            } else if(str.charAt(i) == 'W') {
                x--;
            } else {
                System.out.println("You entered wrong input.");
                System.out.println("Please enter between these 4 only - N / S / E / W");
                return 0;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter only N or S or E or W");
        System.out.println("1. N for North");
        System.out.println("2. S for South");
        System.out.println("3. E for East");
        System.out.println("4. W for West");
        System.out.println("Don't give any extra space");
        System.out.print("Enter the directions: ");
        str = sc.nextLine();
        float distance = shortestPath(str);
        if(distance > 0) {
            System.out.println("Shortest distance is: " + distance);
        }
        sc.close();
    }
}
