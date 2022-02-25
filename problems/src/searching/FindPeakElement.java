/**
 * Given an unsorted array -> Find the peak element
 * What if there are same elements like {10, 10, 10}
 */

/**
 * Naive Solution : Linear
 */

/**
 * NEED TO DISCUSS GFG SOLUTION.
 */
package searching;

public class FindPeakElement {

    public static void main(String[] args) {
//        int [] arr = new int[] {5, 10, 20, 15, 7};
//        int [] arr = new int[] {10, 20, 15, 5, 23, 90, 60};
        int [] arr = new int[] {80, 70, 60};

        System.out.println(peakElement(arr));

    }
    private static int peakElement (int [] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if ( arr.length == 1) {
            return 0;
        }

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            //check if mid is the first or last element (corner edge case)
            if ((mid == 0 && arr[mid] >= arr[mid + 1]) || (mid == arr.length - 1 && arr[mid] >= arr[mid - 1])) {
                return arr[mid];
            }

            // check if mid is not the first or last element but it is the peak
            if ((arr[mid] >= arr[mid - 1]) && (arr[mid] >= arr[mid + 1])) {
                return arr[mid];
            }

            //if mid is not the peak, move toward the side that has an element greater than the mid
            if (arr[mid] <= arr[mid + 1]) {
                low = mid + 1;
            } else if (arr[mid] <= arr[mid - 1]) {
                high = mid - 1;
            }
        }

        return -1;
    }
}
