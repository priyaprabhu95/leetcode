/**
 * Time - O(log n)
 */

package searching;

public class BinarySearchIterative {
    public static void main(String[] args) {
//        int [] arr = new int [] {10, 20, 30, 40, 50, 60}; int x = 20;
//        int [] arr = new int [] {5, 15, 25}; int x = 25;
//        int [] arr = new int [] {5, 10, 15, 25, 35}; int x = 20;
//        int [] arr = new int [] {10, 15}; int x = 5;
        int [] arr = new int [] {10, 10}; int x = 10;

        System.out.println(binarySearch(arr, x));

    }
    private static int binarySearch (int [] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
