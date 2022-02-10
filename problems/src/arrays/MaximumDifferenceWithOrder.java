/**
 * This problem is same as Buy & Sell stocks 1 (from leetcode)
 * Time: O(n)
 * Space: O(1)
 */

package arrays;


public class MaximumDifferenceWithOrder {
    private int maximumDifference (int [] arr) {
        int result = arr[1] - arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            result = Math.max(result, arr[i] - min);
            min = Math.min(min, arr[i]);
        }

        return  result;
    }
}
