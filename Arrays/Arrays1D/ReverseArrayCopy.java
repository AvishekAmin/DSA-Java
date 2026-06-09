package Arrays.Arrays1D;

import java.util.Scanner;

public class ReverseArrayCopy {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reversed array: ");
        for(int i=0; i<arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
