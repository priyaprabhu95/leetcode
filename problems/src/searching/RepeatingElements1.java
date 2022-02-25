/**
 * Constraints:
 * Array size >= 2
 * Only one element repeats (Any number of times)
 * All the elements from 0 to max(arr) are present where max(Arr) is the max value in the array
 */

/**
 * Naive Method: O(n^2). For every element check if there is a repeating element
 * Naive Method: O(n log n). Sort the element and traverse the array once
 * HashMap: O(n). But will take O(n) extra space
 */

/**
 * Efficient solution: (Same as hashmap solution)
 * Time : O(n), Space: O(n)
 * No modification to original array
 */

package searching;

public class RepeatingElements1 {
    public static void main(String[] args) {
        int [] arr = new int[] {0, 2, 1, 3, 2, 2};
        System.out.println(repeatingElements(arr));
    }

    private static int repeatingElements (int [] arr) {
        // Have a boolean array and whenever you find that visited is true, return that array element
        boolean [] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[arr[i]]) {
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return -1;
    }
}
