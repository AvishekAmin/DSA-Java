package Arrays.Arrays2D;

import java.util.Scanner;

public class SearchInSortedMatrix {
    public static boolean isFound(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println(key + " found at position: (" + row + ", " + col + ")");
                return true;
            } else if(key < matrix[row][col]) {
                col--;
            } else if(key > matrix[row][col]) {
                row++;
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
        System.out.println("Enter " + n + " elements (in sorted form both row-wise and column-wise): ");
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
