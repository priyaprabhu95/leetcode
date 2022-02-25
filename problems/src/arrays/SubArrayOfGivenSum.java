/**
 * THIS CODE DOES NOT WORK
 */

/**
 * CONSTRAINT: Non- negative integers, find if there is a sub array with given sum
 */

package arrays;

public class SubArrayOfGivenSum {
    public static void main(String[] args) {
//        int [] arr = new int [] {1, 8, 30, -5, 20, 7};
        int [] arr = new int [] {5, 10, 6, 90, 3};
//        int [] arr = new int [] {5, 5, 5, 5};
        System.out.println(subArrayOfGivenSum(arr, 106));
    }

    private static boolean subArrayOfGivenSum (int [] arr, int sum) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        int start = 0;
        int currentSum = arr[0];
        int n = arr.length;

        for (int end = 1; end < n; end++) {
            while (currentSum > sum && sum < end - 1) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == sum) {
                return  true;
            }
            if (end < n) {
                currentSum += arr[end];
            }
        }

        return (currentSum == sum);
    }
}
