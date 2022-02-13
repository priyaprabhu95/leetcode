package arrays;

//two approaches to the problem
/**
 * APPROACH 1 :
 * Left rotate array by 1 * k times
 * Time: O(n * k)
 * Space: O(1)
**/


/**
 * APPROACH 2:
 * Temporary array of size k and perform the operations
 * Time: O(n)
 * Space: O(k)
 *
 * 1    2   3   4   5   6
 * k = 4
 * 4    3   2   1   6   5
 * 5    6   1   2   3   4
 **/

/**
 * APPROACH 3: (GFG)
 * Reversal Algorithm
 * 1. Reverse 0 to k -1 elements
 * 2. Reverse k to n - 1 elements
 * 3. Reverse whole array
 */
public class LeftRotateByKElements {
    // Approach 2
    private void leftRotateByKElements (int arr[], int k) {
        //temporary array of size k
        int [] temp = new int[k];

        //save first k elements in temp array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        //left shift element from position k to n - 1
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        //move the elements from temp array back to original array
        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = temp[i];
        }
    }

    //Approach3
    private void leftRotateByKElementsGFG(int arr[], int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private void reverse (int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
