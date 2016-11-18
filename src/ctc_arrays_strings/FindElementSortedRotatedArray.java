package ctc_arrays_strings;

/**
 * Created by Nipun on 10/25/16.
 */
public class FindElementSortedRotatedArray {

    public static int findElementInSortedRotatedArray(int array[], int num) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int pivot = findPivot(array);
        System.out.println(pivot + " pivot");

        if (pivot > 0 && num >= array[0] && num <= array[pivot - 1]) {
            return binarySearch(array, 0, pivot - 1, num);
        } else {
            return binarySearch(array, pivot, array.length - 1, num);
        }
    }

    public static int findPivot(int[] array) {

        if (array == null || array.length == 0) {
            return -1;
        }

        if (array.length == 1 || array[0] < array[array.length - 1]) {
            return 0;
        }

        int start = 0, end = array.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            // check if mid+1 is pivot
            if ( array[mid] > array[mid + 1]) {
                return mid + 1;
            } else if (array[start] <= array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0;
    }

    public static int binarySearch(int[] array, int start, int end, int num) {

        if (array == null || array.length == 0) {
            return -1;
        }

        if(start > end || start < 0 || end >= array.length) {
            throw new IllegalArgumentException("Invalid values for start and end! start = " + start + ", end = " + end);
        }

        if(num < array[start] || num > array[end]) {
            return -1;
        }

        while (start <= end) {

            int mid = (start + end) / 2;
            if (array[mid] == num) {
                return mid;
            } else if (num < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 77,78,84,85,21,22,44,54,65 };
        findElementInSortedRotatedArrayTest(array, 43);
    }

    private static void findElementInSortedRotatedArrayTest(int[] array, int num) {
        int index = findElementInSortedRotatedArray(array, num);
        System.out.println("Element " + num + (index >= 0 ? (" found at index " + index) : " not found!"));
    }

}