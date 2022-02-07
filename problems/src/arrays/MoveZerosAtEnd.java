package arrays;

public class MoveZerosAtEnd {

    // Takes O(n^2) time. Not time efficient
    // Naive method
    public void moveZeroesNaive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int j = i + 1;
                while (j < n && arr[j] == 0) {
                    j++;
                }

                //Swap arr[i] and arr[j]
                if (j < n) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    // Efficient - O(n) Time
    public void moveZeroes(int[] nums) {
        int ptr = 0;

        // Add all the non zero numbers to the begining
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[ptr++] = nums[i];
            }
        }

        // Make all the remaining elements zero
        for (int i = ptr; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
