package p001;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class UnitTestQkSort {

    @Test
    public void testAscendingOrder() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.Sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDescendingOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDuplicateElements() {
        int[] arr = {3, 2, 4, 1, 2};
        int[] expected = {1, 2, 2, 3, 4};
        QuickSort.Sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        QuickSort.Sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        int[] expected = {5};
        QuickSort.Sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}
