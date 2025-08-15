package array;

public class ArrayUtil {
    public static void main(String[] args) {
        
    }

    /**
     * Utility method to print an integer array.
     * @param arr Input Array
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
     * @param arr Input Array
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
     * @param arr Input Array
     * @param start Start Index
     * @param end End Index
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
     * @param arr Input Array
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
     * @param arr Input Array
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
     * @param arr Input Array
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

    /**
     * Utility method to find the second minimum value in an integer array.
     * @param arr Input Array
     * @return
     */
    public static int secondMinimumValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i < secondMin && i != min) {
                secondMin = i;
            }
        }

        return secondMin;
    }

    /**
     * Utility method to move zeros to end of an array without changing sequence of non-zero elements.
     * @param arr Input Array
     */
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                // Swap zero with non-zero value
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    /**
     * Utility method to change the size of an array.
     * @param arr Input array
     * @param capacity New length of the array
     * @return Integer array
     */
    public static int[] resize(int[] arr, int capacity) {
        int[] tempArr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        return arr;
    }

    /**
     * Utility method to find the missing number in an array of distinct consecutive numbers.
     * @param arr Input array
     * @return Integer value
     */
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int val : arr) {
            sum -= val;
        }
        return sum;
    }

    public static boolean isPalindromeString(String str) {
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[start] != charArr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
