package Arrays.Arrays1D;

import java.util.Scanner;

public class MaxSubArraySumBruteForce {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum of any sub array: " + maxSum);
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
        maxSubarraySum(arr);
    }
}
