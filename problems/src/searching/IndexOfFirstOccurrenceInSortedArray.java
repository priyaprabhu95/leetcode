/**
 * Iterative solution is better than recursive.
 * Recursive solution will take O(log n) extra space and will require extra function call overheads
 * Time - O(log n)
 */

package searching;

public class IndexOfFirstOccurrenceInSortedArray {
    public static void main(String[] args) {
//        int [] arr = new int [] {10, 20, 30, 40, 50, 60}; int x = 20;
//        int [] arr = new int [] {5, 15, 25}; int x = 25;
        int [] arr = new int [] {5, 10, 10, 25, 35}; int x = 10;
//        int [] arr = new int [] {10, 15}; int x = 5;
//        int [] arr = new int [] {10, 10}; int x = 10;

        System.out.println(indexOfFirstOccurrenceIterative(arr, x));

    }


    public static int indexOfFirstOccurrenceIterative (int [] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return  -1;
    }

    private static int indexOfFirstOccurrenceRecursive (int arr[], int x, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] > x) {
            return  indexOfFirstOccurrenceRecursive(arr, x, low, mid - 1);
        } else if (arr[mid] < x){
            return indexOfFirstOccurrenceRecursive(arr, x, low + 1, high);
        } else {
            if (mid == 0 || arr[mid -1] != arr[mid]) {
                return mid;
            } else return indexOfFirstOccurrenceRecursive(arr, x, low, mid -1);
        }
    }
}
