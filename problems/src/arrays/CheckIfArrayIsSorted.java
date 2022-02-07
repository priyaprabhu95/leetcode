/*
* Time : O(n)
* Space: O(1)
*/

package arrays;

public class CheckIfArrayIsSorted {
    private boolean checkIfArrayIsSorted(int[] arr) {
        if (arr.length == 1) {
            return true;
        }

        //Traverse through the array to make sure the current element is smaller/equal to next element
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
