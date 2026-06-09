package Search;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                start = mid + 1;
            } else if(arr[mid] > key){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements (in sorted way): ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.print(key + " not found!");
        } else {
            System.out.print(key + " is found at index: " + (index + 1));
        }
        sc.close();
    }
}
