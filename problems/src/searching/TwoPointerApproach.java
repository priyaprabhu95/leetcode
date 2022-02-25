/**
 * Naive Approach : O(n^2)
 */

/**
 * Time - O(n): USing hashmap - Two sum Leetcode, but also takes O(n) extra space
 */

/**
 * ISPAIR():: Constraint given here is that it is a sorted array
 * We can use 2 pointer approach here
 * Above solution can be used when it is an unsorted array
 * Time: O(n)
 */

package searching;

public class TwoPointerApproach {

    public static void main(String[] args) {
//        int[] arr = new int[] {2, 5, 8, 12, 30}; int x = 17;
//        int[] arr = new int[] {8, 13, 18}; int x = 14;
        int[] arr = new int[] {2, 3, 4, 8, 9, 20, 30, 40}; int x = 32;
//        int[] arr = new int[] {}; int x = 17;

        System.out.println(isPair(arr, x));
        System.out.println(isTriplet(arr, x));
    }
    private static boolean isPair (int[] arr, int x) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        int left = 0, right = arr.length -1;

        while (left < right) {
            int currSum = arr[left] + arr[right];
            if (currSum == x) {
                return true;
            }

            if (currSum > x) {
                // if the sum is more than required sum, move the pointer having higher value -> right pointer
                right--;
            } else {
                // if the sum is less than required sum, move the pointer having lower value -> left pointer
                left++;

            }
        }

        return false;
    }


    /**
     * ISTRIPLET()::
     * Naive approach takes O(n^3) time
     * Efficient solution:: Run IsPair() for every element -> O(n^2)
     */

    /**
     * If an unsorted array is provided, first sort the array and then apply 2 pointer method
     * Sorting takes O(n log n); two pointer here takes O(n^2)
     * Effective -> O(n^2)
     */


    private static boolean isTriplet(int [] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if(isPairTriplet(arr, x, i + 1, arr.length - 1, arr[i] - x)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPairTriplet (int[] arr, int x, int left, int right, int curr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

       // int left = 0, right = arr.length -1;

        while (left < right) {
            int currSum = arr[left] + arr[right] + curr;
            if (currSum == x) {
                return true;
            }

            if (currSum > x) {
                // if the sum is more than required sum, move the pointer having higher value -> right pointer
                right--;
            } else {
                // if the sum is less than required sum, move the pointer having lower value -> left pointer
                left++;

            }
        }

        return false;
    }


}
