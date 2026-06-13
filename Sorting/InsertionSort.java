package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int currTerm = arr[i];
            int prevPos = i-1;

            while(prevPos >= 0 && arr[prevPos] > currTerm) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }
            arr[prevPos + 1] = currTerm;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        insertionSort(arr);
        System.out.print("Sorted array: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
