package array;

public class Array {
    public static void main(String[] args) {
        // ArrayUtil arrayUtil = new ArrayUtil();

        int[] arr1 = { 32, 54, -43, 2, 9 };

        // ArrayUtil.reverse(arr1, 0, arr1.length - 1);
        ArrayUtil.printIntArray(arr1);
        System.out.println("Minimum Value: " + ArrayUtil.minimumValue(arr1));
        System.out.println("Maximum Value: " + ArrayUtil.maximumValue(arr1));
        System.out.println("Second Minimum Value: " + ArrayUtil.secondMinimumValue(arr1));
        System.out.println("Second Maximum Value: " + ArrayUtil.secondMaximumValue(arr1));

        System.out.println();

        int[] arrWithZeros = { 1, 0, 2, 0, 3, 4, 0, 5};
        ArrayUtil.printIntArray(arrWithZeros);
        ArrayUtil.moveZerosToEnd(arrWithZeros);
        System.out.print("Moved Zeros to End: ");
        ArrayUtil.printIntArray(arrWithZeros);
        System.out.println();

        int[] arr2 = {1, 2, 3, 4};
        arr2 = ArrayUtil.resize(arr2, arr2.length * 2);
        ArrayUtil.printIntArray(arr2);

        int[] arr3 = {1, 2, 3, 6};
        System.out.println("Missing number: " + ArrayUtil.findMissingNumber(arr3));
    }
}
