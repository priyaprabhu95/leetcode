/**
 * Time: O(n)
 */

package arrays;

public class MaxSumOfKConsecutiveElements {

    public static void main(String[] args) {
//        int [] arr = new int [] {1, 8, 30, -5, 20, 7};
//        int [] arr = new int [] {5, -10, 6, 90, 3};
        int [] arr = new int [] {5, 5, 5, 5};
        System.out.println(maxSumOfKConsecutiveElements(arr, 4));
    }
    private static int maxSumOfKConsecutiveElements (int [] arr, int k) {
        int currSum = 0;
        int n = arr.length;

        //find the sum of first K elements
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        int maxSum = currSum;

        //sliding window loop
        for (int start = 1; start < n - k; start++) {
            currSum = currSum - arr[start - 1] + arr[start + k - 1];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
