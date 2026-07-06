package Arrays.Arrays2D;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static int[][] transposeMatrix(int matrix[][], int row, int col) {
        
        int transpose[][] = new int[col][row];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        int n = row * col;
        System.out.println("Enter " + n + " elements: ");
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int transpose[][] = transposeMatrix(matrix, row, col);
        System.out.println("Transpose Matrix is: ");
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
