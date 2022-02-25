/**
 * Time Complexity of Naive Solution : O(sqrt(n))
 * Time Complexity of Efficient Solution : O(log n)
 */


package searching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(67));
    }

    private static int squareRoot (int x) {
        int low = 0, high = x, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midSquare = mid * mid;
            if (midSquare == x) {
                return mid;
            } else if (midSquare > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                result = mid;
            }
        }
        return result;
    }



    private static int squareRootNaive (int x) {
        if (x == 0) {
            return 0;
        }
        int i;
        for (i = 1; i * i <= x; i++);

        return i - 1;
    }
}
