package arrays;
/**
 * Time : O(n)
 */

/**
 * An element is said to be in majority if it appears more than n/2 times in the array
 */

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = new int[] {6, 7, 6, 7, 6, 7, 6};
        System.out.println(majorityElement(arr));
    }

    /**
     * Find a candidate. Then check if the candidate is the majority element
     */
    private static int majorityElement (int [] arr) {
        // find a candidate
        int candidate = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[candidate] == arr[i]) {
                count++;
            } else {
                count --;
            }
            if (count == 0) {
                candidate = i;
                count = 1;
            }
        }

        // The above FOR loop guarantees that if the array has a majority element,
        // the "candidate" variable will hold the element with majority frequency

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[candidate]) {
                count++;
            }
        }

        if (count < arr.length/2) {
            return -1;
        }
        return candidate;
    }

    private static int majorityElementNaive (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > arr.length/2)
                return i;
        }
        return  -1;
    }
}
