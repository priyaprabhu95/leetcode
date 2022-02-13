package arrays;

public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        int [] arr = new int [] {10, 12, 14, 7, 8};
//        int [] arr = new int [] {7, 10, 13, 14};
//        int [] arr = new int [] {10, 12, 14};
//        int [] arr = new int [] {3};

        System.out.println(longestEvenOddSubarray(arr));

    }

    private static int longestEvenOddSubarray (int [] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            // Check if previous and current element is even/odd and if it is alternating
            if ((arr[i] % 2 == 00 && arr[i - 1] %2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currentCount++;
                maxLength = Math.max(currentCount, maxLength);
            } else currentCount = 1;
        }
        return maxLength;
    }
}
