package arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
//        int [] arr = new int[] {2, 3, -8, 7, -1, 2, 3};
//        int [] arr = new int[] {5, 8, 3};
        int [] arr = new int[] {-6, -1, -8};
        System.out.println(maxSubarray(arr));
    }

    /**
     * Brute Force: Time taken - O(n^2)
     */
    private static int maxSubarraySumBruteForce (int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                max = Math.max(currentSum, max);
            }
        }
        return max;
    }

    /**
     * For every element in the array, find the maximum sum of subarray that ends at the subarray
     * maxEnding(i) = max(maxEnding(i - 1) + arr[i], arr[i])
     * Either consider max until previous element and add current element
     * OR
     * Just consider the current element
     */
    private static int maxSubarray (int [] arr) {
        int maxEnding = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            result = Math.max(maxEnding, result);
        }
        return result;
    }

}
