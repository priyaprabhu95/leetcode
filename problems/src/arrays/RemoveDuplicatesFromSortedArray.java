/*
Time: O(n)
Space: O(1)
*/

//Both solutions work
package arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] arr = new int[] {5, 5, 10, 15, 20, 20};
        int [] arr1 = new int[] {10, 10, 10 };
        int [] arr2 = new int[] {3};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
    }
    private static int removeDuplicates(int [] arr) {
        int i =0, j =1;
        int n = arr.length;
        for (i = 0, j = 1; j < n; j++) {
            // if same elements, ignore
            if (arr[i] == arr[j]) {
                continue;
            } else {
                // if different elements, add it to the position next of the ith position
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    // GFG Solution
    private static int removeDuplicatesGFG (int[] arr) {
        int res = 1;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res -1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }
}
