package array;

public class ArrayUtil {
    public static void main(String[] args) {
        
    }

    /**
     * Utility method to print an integer array.
     * @param arr
     */
    public static void printIntArray(int[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            // Avoid comma if last element is detected
            if (i + 1 != n) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Utility method to remove even integers from an array.
     * @param arr
     * @return
     */
    public static int[] removeEvenInt(int[] arr) {

        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
    /**
     * Utility method to reverse an integer array in the given range
     * @param arr
     * @param start
     * @param end
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swapping
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Utility method to find the minimum value in an integer array.
     * @param arr
     * @return
     */
    public static int minimumValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        int length = arr.length - 1;
        for (int i = 0; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    
    /**
     * Utility method to find the maximum value in an integer array.
     * @param arr
     * @return
     */
    public static int maximumValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int length = arr.length - 1;
        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * Utility method to find the second maximum value in an integer array.
     * @param arr
     * @return
     */
    public static int secondMaximumValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }

        return secondMax;
    }
}
