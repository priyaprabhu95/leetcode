/*
* Time : O(n)
* Space: O(1)
*/

package arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
//        int [] arr = new int[]{5, 20, 12, 28, 8};
//        int [] arr = new int[]{1, 1, 1};
//        int [] arr = new int[]{5, 20};
        int [] arr = new int[]{3, 2, 1};
        System.out.print(checkIfArrayIsSorted(arr));
    }

    private static boolean checkIfArrayIsSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        if (arr.length == 1) {
            return true;
        }

        //Traverse through the array to make sure the current element is smaller/equal to next element
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
