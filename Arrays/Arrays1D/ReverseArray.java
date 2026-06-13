package Arrays.Arrays1D;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int arr[]) {
        int start = 0, end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        reverseArray(arr);
        System.out.println("Reversed array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
