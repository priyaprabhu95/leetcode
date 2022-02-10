/**
 * Time: O(n)
 */

package arrays;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        int [] arr = new int[] {10, 10, 10, 25, 30, 30};
        int [] arr1 = new int[] {10, 10, 10};
        int [] arr2 = new int[] {10, 25, 30};
        frequencyInSortedArray(arr2);
    }
    private static void frequencyInSortedArray (int [] arr) {
        int i = 0, j = 0;

        // Since we are starting j from i, initial freq is 0
        //It will be considered during the first comparison
        while (i < arr.length) {
            int freq = 0;
            while (j < arr.length && arr[i] == arr[j]) {
                freq++;
                j++;
            }
            System.out.println("Frequency of " + arr[i] +": " + freq);
            i = j;
        }
    }
}
