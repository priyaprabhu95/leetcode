/*
* Time: O(n)
* Space: O(1)
* */

package arrays;

public class SecondLargestElementinArray {
    public static void main(String[] args) {
        int [] arr = new int[]{5, 20, 12, 20, 8};
        System.out.print(secondLargest(arr));
    }


    private static int secondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int position = -1;
        if (arr == null || arr.length == 0) {
            return -1;
        } else {
            //traverse the entire array to compare the current element with max1 and max2
            // Update the position of max2
            for (int i = 0; i < arr.length; i++) {
                // Consider the case of when the largest element appears more than once
                if (arr[i] >= max1) {
                    max1 = arr[i];
                } else if (arr[i] > max2) {
                    max2 = arr[i];
                    position = i;
                }
            }
            return position;
        }
    }
}


/*
* GFG -> consider 2 variables only: result position, largest position and continue
* */