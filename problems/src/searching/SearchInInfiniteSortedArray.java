/**
 * Time complexity for linear solution is - O(position)
 */

/**
 * My approach for binary search -
 * If the element is x, do a binary search until position:  abs(arr[0]) + x
 * eg: -2, -1, 0, 1, 2, 3, ...; x = 2
 * Perform a binary search until: |-2| + 2 = 4
 * But this case would not work if the sorted array has elements repeated
 */

/**
 * GFG Efficient Approach: UNBOUNDED BINARY SEARCH
 * Keep on incrementing the position by 2 to find the max highest possible
 * Perform binary search considering the highest position found - Binary search between position/2 and position
 * Time complexity: O(log position) + O(log position) = O(log position)
 */

package searching;

public class SearchInInfiniteSortedArray {
    private static int searchInfiniteLinear (int [] arr, int x) {
        int result = 0;
        while (arr[result] <= x) {
            if (arr[result] == x) {
                return result;
            } else if (arr[result] > x) {
                return -1;
            }
            result++;
        }
        return -1;
    }

    private static int searchInfinite (int [] arr, int x) {
        if (arr[0] == x) {
            return 0;
        }

        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
        }
        if (arr[i] == x) {
            return i;
        }

        return BinarySearchRecursive.binarySearch(arr, x, i/2 + 1, i - 1);
    }
}
