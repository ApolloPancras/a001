package p001;

import java.util.Arrays;

public class ArrySort {
    public static void main(String[] args) {
        // int[] arr = {6,9,2,9,1,3,6,8};
        // arr = bubble(arr);
        int[] arr = {9,-16,10,30,9,23,-30,-49,9,25,21,30};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] data, int start, int end){
        if (start >= end) {
            return;
        }
        int pivot = partition(data, start, end);
        quickSort(data, start, pivot - 1);
        quickSort(data, pivot + 1, end);
    }

private static int partition(int[] data, int start, int end) {
    if (data == null || start >= end || start < 0 || end >= data.length) {
        throw new IllegalArgumentException("Invalid input");
    }
    int pivot = data[start];
    int left = start + 1;
    int right = end;
    while (left < right) {
        while (left < right && data[left] <= pivot) {
            left++;
        }
        while (left < right && data[right] > pivot) {
            right--;
        }
        swap(data, left, right);
    }
    swap(data, start, left - 1);
    return left - 1;
}

    private static void swap(int[] data, int i, int j) {
        System.out.println(Arrays.toString(data));
        System.out.print("["+i+"]="+data[i]+"<-->["+j+"]"+data[j]+";!");
        if (i == j || data[i] == data[j]) {
            System.out.println("***"+ i + "***" +j);
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static int[] bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
}
