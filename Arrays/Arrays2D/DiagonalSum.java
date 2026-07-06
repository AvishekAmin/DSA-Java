package Arrays.Arrays2D;

import java.util.Scanner;

public class DiagonalSum {
    public static void diagonalSum(int[][] matrix) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(i == j || j == matrix.length-i-1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.print("Diagonal sum: " + sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows / columns (row == column): ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.print("Enter " + n*n + " elements: \n");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        diagonalSum(matrix);
    }
}
