package array;

// import array.ArrayUtil;

public class ArrayInit {
    public static void main(String[] args) {
        // Declaration
        int arr1[];
        int[] arr2;

        // Initialization
        arr1 = new int[5];
        arr2 = new int[5];

        // Declaration and Initialization
        int arr3[] = new int[5];
        int[] arr4 = new int[5];

        // Declaration and Initialization with values
        int arr5[] = { 1, 2, 3, 4, 5, 6 };
        int[] arr6 = { 1, 2, 3, 4, 5, 6 };

        int[] arr7 = new int[] { 1, 2, 3, 4, 5, 6 };

        ArrayUtil arrUtil = new ArrayUtil();

        arrUtil.printIntArray(arr1);
        arrUtil.printIntArray(arr2);
        arrUtil.printIntArray(arr3);
        arrUtil.printIntArray(arr4);
        arrUtil.printIntArray(arr5);
        arrUtil.printIntArray(arr6);
        arrUtil.printIntArray(arr7);
    }
}
