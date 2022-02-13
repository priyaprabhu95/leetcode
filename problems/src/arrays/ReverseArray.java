/*
Time: O(n)
Space: O(1)
*/

package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
//        int [] arr = new int [] {1, 2};
        int [] arr = new int [] {1, 2, 3};
//        int [] arr = new int [] {1};
//        int [] arr = new int [] {1, 2, 4, 4, 5, 6, 2, 6, 6};
//        int [] arr = new int [] {1, 2, 4, 4, 5, 6, 2, 6, 6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverseArray(int [] arr) {
        int n = arr.length;
        if (n == 1) {
            return;
        }

        for (int i = 0; i <= n/2 - 1; i++) {
            //Swap the ith element with (n - 1 -i)th element
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    //GeeksForGeeks solution
    private void reverseArrayGFG(int [] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
