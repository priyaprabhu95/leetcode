/*
* Time: O(n)
* Space: O(1)
* */

package arrays;

public class SecondLargestElementinArray {
    public static void main(String[] args) {
//        int [] arr = new int[]{5, 20, 12, 28, 8};
//        int [] arr = new int[]{1, 1, 1};
//        int [] arr = new int[]{5, 20};
        int [] arr = new int[]{3, 2, 1};
        System.out.print(secondLargest(arr));
    }


    private static int secondLargest(int[] arr) {
       int max1pos = 0;
       int max2pos = -1;

       // We can not have second largest element if the size of the array is 1
       if (arr == null || arr.length < 2 ) {
           return -1;
       }

       //traverse the array
        for (int i = 1; i < arr.length; i++) {
            //  compare the current element with the element at max1pos
            if (arr[i] > arr[max1pos]) {
                max2pos = max1pos;
                max1pos = i;
            } else if (arr[i] < arr[max1pos] && (max2pos == -1 || arr[i] > arr[max2pos])) {
                max2pos = i;
            }
        }
       return max2pos;
    }




    private static int secondLargestOld(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int position = 0;
        if (arr == null || arr.length < 2) {
            return -1;
        } else {
            //traverse the entire array to compare the current element with max1 and max2
            // Update the position of max2
            for (int i = 0; i < arr.length; i++) {
                // Consider the case of when the largest element appears more than once
                if (arr[i] >= max1) {
                    max2 = max1;
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