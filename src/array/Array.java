package array;

public class Array {
    public static void main(String[] args) {
        // ArrayUtil arrayUtil = new ArrayUtil();

        int[] arr1 = { 32, 54, -43, 2, 9 };

        // ArrayUtil.reverse(arr1, 0, arr1.length - 1);
        ArrayUtil.printIntArray(arr1);
        System.out.println("Minimum Value: " + ArrayUtil.minimumValue(arr1));
        System.out.println("Maximum Value: " + ArrayUtil.maximumValue(arr1));
        System.out.println("Second Maximum Value: " + ArrayUtil.secondMaximumValue(arr1));
    }
}
