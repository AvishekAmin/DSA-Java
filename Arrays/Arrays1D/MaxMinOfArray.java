package Arrays.Arrays1D;

import java.util.Scanner;

public class MaxMinOfArray {
    public static int maximum(int arr[]) {
        int max = Integer.MIN_VALUE;    // -infinity
        for (int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minimum(int arr[]) {
        int min = Integer.MAX_VALUE;    // +infinity
        for (int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Maximum is: " + maximum(arr));
        System.out.println("Minimum is: " + minimum(arr));
    }
}
