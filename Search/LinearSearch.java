package Search;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.print(key + " not found!");
        } else {
            System.out.print(key + " is found at index: " + (index + 1));
        }
        sc.close();
    }
}
