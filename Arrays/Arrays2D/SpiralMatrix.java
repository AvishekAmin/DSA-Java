//  01 -> 02 -> 03 -> 04 -> 05          01 02 03 04 05
//                          *
//  06 -> 07 -> 08 -> 09    10          06 07 08 09 10
//  ^                 *     *
//  11    12 ->[13]   14    15    ->    11 12 13 14 15
//  ^     ^           *     *       
//  16    17 <- 18 <- 19    20          16 17 18 19 20
//  ^                       *
//  21 <- 22 <- 23 <- 24 <- 25          21 22 23 24 25

package Arrays.Arrays2D;

import java.util.Scanner;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {
            // Top Part
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // Right Part
            for(int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom Part
            for(int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // Left Part
            for(int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
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
        System.out.println("Output: ");
        printSpiral(matrix);
    }
}
