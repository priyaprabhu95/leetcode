/**
 * GIVEN CONSTRAINT: Distinct elements (DID NOT UNDERSTAND THE REASON FOR THIS CONSTRAINT)
 */
/**
 * Naive Solution: Linear
 */

/**
 * Efficient solution: At least one half of the array will be sorted. Check if the required element is in that range
 * from start to mid/mid to end. Depending on the comparisons, keep on discarding one half
 * Time : O(log n)
 */
package searching;

public class SearchInSortedRotatedArray {

    public static void main(String[] args) {
//        int [] arr = new int [] {10, 20, 30, 40,5, 8}; int x = 20;
//        int [] arr = new int [] {25, 15, 23}; int x = 25;
        int [] arr = new int [] {10, 20, 30, 40, 5, 8}; int x = 6;
//        int [] arr = new int [] {10, 15}; int x = 5;
//        int [] arr = new int [] {10, 10}; int x = 10;

        System.out.println(search(arr, x));
    }

    private static int search (int [] arr, int x) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            // left half is sorted
            if (arr[low] < arr[mid]) {
                if (x >= arr[low] && x < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            //right half is sorted
            else {
                if (x > arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
