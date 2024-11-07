import com.barry.code.sort.MergeSort;
import com.barry.utils.ArrayUtils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

class MergeSortTest {

    @Test
    void testMergeSort() {
        // 通过随机数组测试100000次
        for (int i = 0; i < 100000; i++) {
            int[] arr = ArrayUtils.generateRandomArray(1000, 100);
            MergeSort.mergeSort(arr);
            int[] expected = arr.clone();
            Arrays.sort(expected);
            assertArrayEquals(expected, arr);
        }
    }

}
