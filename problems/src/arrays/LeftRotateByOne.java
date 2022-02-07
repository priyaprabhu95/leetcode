/*
* Time: O(n)
* Space: O(1)
* */

package arrays;

public class LeftRotateByOne {
    private void leftRotateByOne(int [] arr) {
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
