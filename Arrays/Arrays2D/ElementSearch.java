package Arrays.Arrays2D;

import java.util.Scanner;

public class ElementSearch {
    public static boolean isFound(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println(key + " found at position: " + "(" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println(key + " not found!");
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        int n = row * col;
        System.out.print("Enter " + n + " elements: \n");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        sc.close();
        isFound(matrix, key);
    }
}
