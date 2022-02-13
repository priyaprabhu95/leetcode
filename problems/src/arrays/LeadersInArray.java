package arrays;
import java.util.*;
/**
 * Leader in an array: An element is considered to be a leader if there is no element greater than itself
 * to its right
 */

/**
 * APPROACH 1:
 * Time: O(n^2)
 * For every element go through the rest of the array to find if there is any element greater than it
 */

/**
 * APPROACH 2:
 * Time: O(n)
 * Iterate the array from right to left
 * have a variable max and find the elements greater than max
 * Add the new element to the output and update the max to the new element
 */

/**
 * 7    10  4   3   6   1   2
 * max = 2 -> Add to output
 * max = 6 -> Add to output
 * ...
 */
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = new int[] {7, 10, 4, 3, 6, 5, 2};
//        int[] arr1 = new int[] {30, 20, 10};
        int[] arr1 = new int[] {10, 10};
        System.out.print(leadersInArray(arr1));
    }
    private static Set<Integer> leadersInArray(int [] arr) {
        Set<Integer> result = new HashSet<Integer>();
        int n = arr.length;
        int max = arr[n -1];
        result.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                result.add(max);
            }
        }
        return result;
    }
}
