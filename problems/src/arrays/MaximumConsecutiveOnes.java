package arrays;

/**
 * Time : O(n)
 */
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
//        int [] arr = new int [] {0, 1, 1, 0, 1, 0};
//        int [] arr = new int [] {1, 1, 1};
//        int [] arr = new int [] {0, 0, 0};
//        int [] arr = new int [] {1, 0, 1, 1, 1, 1, 0, 1};
        int [] arr = new int [] {0, 1, 1, 0, 1, 1, 1};

        System.out.println(maximumConsecutiveOnes(arr));
    }
    private static int maximumConsecutiveOnes (int [] arr) {
        int max = 0, currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
            } else {
                max = Math.max(currentCount, max);
                currentCount = 0;
            }
        }

        //to consider the edge case where max consecutive 1s will be at the end
        // and the else condition wont be reached
        // 0 1 1 0 1 1 1
        max = Math.max(currentCount, max);
        return max;
    }
}
