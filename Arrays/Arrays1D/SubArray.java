package Arrays.Arrays1D;

import java.util.Scanner;

public class SubArray {
    public static void printSubarrays(int arr[]) {
        int count = 0; 
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(arr[k] + " ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + count);
    }
    public static void main(String args[])
    {
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
        System.out.println("Subarrays are: ");
        printSubarrays(arr);
    }
}
