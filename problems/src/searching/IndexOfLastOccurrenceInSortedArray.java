package searching;

public class IndexOfLastOccurrenceInSortedArray {

    public static void main(String[] args) {
//        int [] arr = new int [] {10, 20, 30, 40, 50, 60}; int x = 20;
//        int [] arr = new int [] {5, 15, 25}; int x = 25;
//        int [] arr = new int [] {5, 10, 10, 25, 35}; int x = 10;
//        int [] arr = new int [] {10, 15}; int x = 5;
        int [] arr = new int [] {10, 10}; int x = 10;

        System.out.println(indexOfLastOccurrenceIterative(arr, x));

    }
    public static int indexOfLastOccurrenceIterative (int [] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return  -1;
    }
}
