package Loops;

public class Continue {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            if (i==4) {
                continue;      // Skip 4
            }
            System.out.print(i + " ");
        }
    }
}
