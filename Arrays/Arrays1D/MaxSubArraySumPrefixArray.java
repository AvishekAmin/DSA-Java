package Arrays.Arrays1D;

import java.util.Scanner;

public class MaxSubArraySumPrefixArray {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                if(start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start-1];
                }
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
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
