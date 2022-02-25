package searching;

public class BinarySearchRecursive {

    public static void main(String[] args) {
//        int [] arr = new int [] {10, 20, 30, 40, 50, 60}; int x = 20;
//        int [] arr = new int [] {5, 15, 25}; int x = 25;
        int [] arr = new int [] {5, 10, 15, 25, 35}; int x = 20;
//        int [] arr = new int [] {10, 15}; int x = 5;
//        int [] arr = new int [] {10, 10}; int x = 10;

        System.out.println(binarySearch(arr, x, 0, arr.length - 1));

    }
    public static int binarySearch (int [] arr, int x, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return  binarySearch(arr, x, low, mid - 1);
        } else {
            return binarySearch(arr, x, low + 1, high);
        }
    }
}
