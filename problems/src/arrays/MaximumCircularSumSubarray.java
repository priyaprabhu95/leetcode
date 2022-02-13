package arrays;

/**
 * Approach 1: Naive solution
 * Consider every element as the beginning element and find the max sum that can be obtained
 */

/**
 * Approach 2: Efficient Solution
 * Taking the max of - max sum of normal subarray AND max sum of circular subarray (find minimum sum of normal subarray)
 */
public class MaximumCircularSumSubarray {
    public static void main(String[] args) {
        int[] arr = new int [] {8, -4, 3, -5, 4};
        System.out.println(circularMaxSum(arr));
    }

    private static int maximumCircularSumNaive (int [] arr) {
        int result = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currMax = arr[i];
            int currSum = arr[i];
            for (int j = 1; i < n; j++) {
                int index = (i + j) % n;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }

            result = Math.max(currMax, result);
        }
        return result;
    }

    /**
     * APPROACH 2
     */
    private static int normalMaxSum (int [] arr) {
        int maxEnding = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            result = Math.max(maxEnding, result);
        }
        return result;
    }

    private static int circularMaxSum (int [] arr) {
        int maxNormal = normalMaxSum(arr);

        // Possible when all elements of the array are negative.
        if (maxNormal < 0) {
            return maxNormal;
        }

        // to find the minimum normal sum, invert all the elements and call finding maxsum function
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }

        int maxCircular = arrSum + normalMaxSum(arr);
        return Math.max(maxCircular, maxNormal);

    }
}
