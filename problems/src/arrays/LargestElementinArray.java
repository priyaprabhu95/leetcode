package arrays;

public class LargestElementinArray {
    private int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr == null || arr.length == 0) {
            return -1;
        }
        // Traverse through the entire array to find max
        else for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private int largestElementPosition(int[] arr) {
        int position = 0;
        if (arr == null || arr.length == 0) {
            return -1;
        }
        // Traverse through the entire array to find the position of max value
        else for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[position]) {
                position = i;
            }
        }
        return position;
    }
}


