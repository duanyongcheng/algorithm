import com.barry.code.sort.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeSortTest {

    @Test
    void testMergeSort() {
        // Test case 1: Normal array
        int[] arr1 = {5, 2, 8, 12, 1, 6};
        int[] expected1 = {1, 2, 5, 6, 8, 12};
        assertArrayEquals(expected1, MergeSort.mergeSort(arr1));

        // Test case 2: Array with duplicate elements
        int[] arr2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected2 = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(expected2, MergeSort.mergeSort(arr2));

        // Test case 3: Already sorted array
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected3, MergeSort.mergeSort(arr3));

        // Test case 4: Reverse sorted array
        int[] arr4 = {5, 4, 3, 2, 1};
        int[] expected4 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected4, MergeSort.mergeSort(arr4));

        // Test case 5: Array with one element
        int[] arr5 = {1};
        int[] expected5 = {1};
        assertArrayEquals(expected5, MergeSort.mergeSort(arr5));

        // Test case 6: Empty array
        int[] arr6 = {};
        int[] expected6 = {};
        assertArrayEquals(expected6, MergeSort.mergeSort(arr6));

        // Test case 7: Null array
        assertNull(MergeSort.mergeSort(null));
    }
}
