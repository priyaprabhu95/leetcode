/*
* Time: O(n)
* Space: O(1)
* */

package arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3};
        leftRotateByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void leftRotateByOne(int [] arr) {
        int n = arr.length;
        if (n == 1) {
            //no operation required
            return;
        }

        //Save the first element in a temp variable
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }
}
