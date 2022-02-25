/**
 * Find the index of first occurrence then find the index of last occurrence
 * Difference in the indices will give the result of number of occurrence in the entire array
 * Each of the solutions have time complexity = O(log n). So this problem has time complexity = O(log n)
 */

package searching;

public class CountOccurrencesInSorted {

    public static void main(String[] args) {
//        int [] arr = new int [] {10, 20, 30, 40, 50, 60}; int x = 20;
//        int [] arr = new int [] {5, 15, 25}; int x = 25;
//        int [] arr = new int [] {5, 10, 10, 25, 35}; int x = 10;
//        int [] arr = new int [] {10, 15}; int x = 5;
        int [] arr = new int [] {10, 10, 10, 40}; int x = 10;

        System.out.println(countOccurrences(arr, x));

    }

    private static int countOccurrences (int [] arr, int x) {
        int first = IndexOfFirstOccurrenceInSortedArray.indexOfFirstOccurrenceIterative(arr, x);
        // If the element is not present at all, index of first occurrence will return -1
        if (first == -1) {
            return 0;
        }

        int last = IndexOfLastOccurrenceInSortedArray.indexOfLastOccurrenceIterative(arr, x);
        return (last - first + 1);
    }
}
