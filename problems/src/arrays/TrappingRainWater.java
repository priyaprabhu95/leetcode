package arrays;

/**
 * Edge case:
 * If the arrays are sorted in ascending or descending order, the amount of water trapped = 0
 * If the size of the array <= 2, amount of water trapped = 0
 */


public class TrappingRainWater {
    public static void main(String[] args) {
        int [] arr = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // int [] arr = new int[] {};
        // int [] arr = new int[] {};

        System.out.print(waterTrappedLC(arr));
    }

    /**
     * Initialize left ptr = 0, right ptr = n - 1
     * navigate in opposite directions-> update the pointers and the results too
     * @param arr
     * @return
     */
    private static int waterTrappedLC (int [] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Nothing can be trapped between 2 bars
        if (arr.length <= 2) {
            return 0;
        }

        // Have a left pointer and a right pointer
        // Calculate the result while traversing and considering the lmax for left and rmax for right
        int leftPtr = 0, rightPtr = arr.length - 1, leftMax = 0, rightMax = 0;
        int result = 0;
        while (leftPtr < rightPtr) {
            if (arr[leftPtr] < arr[rightPtr]) {
                if (arr[leftPtr] >= leftMax)
                    leftMax = arr[leftPtr];
                else
                    result += leftMax - arr[leftPtr];
                leftPtr++;
            } else {
                if (arr[rightPtr] >= rightMax)
                    rightMax = arr[rightPtr];
                else
                    result += rightMax - arr[rightPtr];
                rightPtr--;
            }
        }
        return result;
    }

    /**
     * Have 2 arrays lmax and rmax which store the left-max and right-max of the current element
     * But will incur extra space
     */
    private static int waterTrappedGFG (int [] arr) {
        int result = 0;
        int n = arr.length;
        int [] lmax = new int [n];
        int [] rmax = new int [n];

        //fill lmax
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }

        //fill rmax
        rmax[n-1] = arr[n-1];
        for (int i = n -2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }

        //compute the area
        for (int i = 0; i < n; i++) {
            result += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return result;
    }
}
