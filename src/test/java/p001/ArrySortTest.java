package p001;

import org.junit.Assert;
import org.junit.Test;

public class ArrySortTest {

    @Test
    public void testBubbleSort() {
        // 创建一个无序数组
        int[] arr = {5, 3, 8, 4, 2};
        // 调用待测函数
        int[] sortedArr = ArrySort.bubble(arr);
        // 预期的排序结果
        int[] expected = {2, 3, 4, 5, 8};
        // 验证排序结果是否正确
        Assert.assertArrayEquals("The array was not sorted correctly.", expected, sortedArr);
    }

    @Test
    public void testBubbleSortWithEmptyArray() {
        // 创建一个空数组
        int[] arr = {};
        // 调用待测函数
        int[] sortedArr = ArrySort.bubble(arr);
        // 预期的排序结果
        int[] expected = {};
        // 验证排序结果是否正确
        Assert.assertArrayEquals("The array was not sorted correctly.", expected, sortedArr);
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        // 创建一个已经排序的数组
        int[] arr = {1, 2, 3, 4, 5};
        // 调用待测函数
        int[] sortedArr = ArrySort.bubble(arr);
        // 预期的排序结果
        int[] expected = {1, 2, 3, 4, 5};
        // 验证排序结果是否正确
        Assert.assertArrayEquals("The array was not sorted correctly.", expected, sortedArr);
    }

    @Test
    public void testBubbleSortWithReverseSortedArray() {
        // 创建一个逆序排列的数组
        int[] arr = {5, 4, 3, 2, 1};
        // 调用待测函数
        int[] sortedArr = ArrySort.bubble(arr);
        // 预期的排序结果
        int[] expected = {1, 2, 3, 4, 5};
        // 验证排序结果是否正确
        Assert.assertArrayEquals("The array was not sorted correctly.", expected, sortedArr);
    }
}
