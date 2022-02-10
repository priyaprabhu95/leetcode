package arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
//        int [] arr = new int[] {2, 3, -8, 7, -1, 2, 3};
//        int [] arr = new int[] {5, 8, 3};
        int [] arr = new int[] {-6, -1, -8};
        System.out.println(maxSubarraySumBruteForce(arr));
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
}
