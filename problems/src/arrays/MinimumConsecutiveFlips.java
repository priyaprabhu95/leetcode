package arrays;

/**
 * Naive Solution : Traverse through the array from left to right, count the number of groups of 0s and 1s
 * Determine if 0 needs to be flipped or 1 depending on the number having min groups
 * Traverse through the array once more to find the indexes of the element to be flipped
 */

/**
 * HOW TO DETERMINE THE SOLUTION IN ONE TRAVERSAL:
 * The difference in numberOfGroups(0) and numberOfGroups(1) will always be either 1 or 0
 * 110011001 -> numberOfGroups(0) = 2, numberOfGroups(1) = 3
 * 11001100 -> numberOfGroups(0) = 2, numberOfGroups(1) = 2
 *
 * This can be determined by checking the first and the last element of the array
 * If it's same, difference is 1
 * If it's different, difference is 0
 */

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
//        int [] arr = new int[] {0, 0, 1, 1, 1, 0, 0, 1};
//        int [] arr = new int[] {0, 0, 0};
//        int [] arr = new int[] {1, 0, 1, 1, 1, 0};
        int [] arr = new int[] {1, 0, 0, 1, 0, 0, 0, 1};

        minConsecutiveFlips(arr);
    }
    private static void minConsecutiveFlips (int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.println(i - 1);
                }
            }
        }
        if (arr[n - 1] != arr[0]) {
            System.out.println(n - 1);
        }
    }
}
