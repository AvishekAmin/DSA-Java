package Arrays.Arrays1D;

import java.util.Scanner;

public class Pairs {
    public static void pairs(int arr[]) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            int curr = arr[i];
            for (int j=i+1; j<arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total no. of pairs: " + count);
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
        System.out.print("All possible pairs are: ");
        System.out.println();
        pairs(arr);
    }
}
