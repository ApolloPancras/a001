package p001;

import java.util.Arrays;

public class QuickSort {
    private static int wCount =0;
    private static int sCount =0;
    public static void main(String[] args) {
        int[] arr = {9,-16,9,30,23,-30,-49,25,21,30};
        // int[] arr = {5, 4, 3, 2, 1};
        // int[] arr = {5,1,5,2,5,3,5,4,5};
        // int[] arr = {9,-16,10,30,9,23,-30,-49,9,25,21,30};
        // System.out.print(Arrays.toString(arr));
        Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("循环次数="+wCount+", 交换次数"+sCount);
        System.out.println("======================================");
        // int[] arr2 = {9,-16,9,30,23,-30,-49,25,21,30};
        // int[] arr2 = {5, 4, 3, 2, 1};
        // int[] arr2 = {5,1,5,2,5,3,5,4,5};
        // int[] arr2 = {9,-16,10,30,9,23,-30,-49,9,25,21,30};
        // Sort2(arr2, 0, arr2.length - 1);
        // System.out.println(Arrays.toString(arr2));
        // System.out.println("循环次数="+wCount+", 交换次数"+sCount);
    }

    static void Sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        Sort(arr, start, pivotIndex);
        Sort(arr, pivotIndex + 1, end);
    }

    static void Sort2(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partition2(arr, start, end);
        Sort(arr, start, pivotIndex - 1);
        Sort(arr, pivotIndex + 1, end);
    }

    private static void swap(int[] arr, int i, int j) {
        System.out.print(Arrays.toString(arr));
        System.out.println("["+ i + "]=" + arr[i] + "swap[" + j + "]=" + arr[j]);
        if (i == j || arr[i] == arr[j]) {
        //    System.out.println("---"+i+"---"+j);
           return; 
        }
        sCount++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int start, int end) {
        // int pivotIndex = getMiddleIndex(arr, start, end);
        int pivotIndex = (start+end)/2;
        int pivotValue = arr[pivotIndex];
        int left = start - 1;
        int right = end + 1 ;
        while (true) {
            wCount++;
            do {
                left++;
            } while (arr[left] < pivotValue);
            do {
                right--;
            } while (arr[right] > pivotValue);
            if (left >= right) {
                return right;
            }
            swap(arr, left, right);
        }
    }

    private static int getMiddleIndex(int[] arr, int start, int end) {
        int middle = (start + (end - start) ) / 2;
        if ((arr[start] < arr[middle] && arr[middle] < arr[end])||(arr[end] < arr[middle] && arr[middle] < arr[start])) {
            return middle;
        } else if((arr[start] < arr[end] && arr[end] < arr[middle])||(arr[middle] < arr[end] && arr[end] < arr[start])){
            return end;
        }else{
            return start;
        }
    }
    
    public static int partition2(int[] arr, int start, int end) {
        int pivotIndex = (start + end)/2;
        int pivot = arr[pivotIndex];
        // swap(arr, pivotIndex, start);
        int left = start;
        int right = end ;
        while (left < right) {
            wCount++;
            while (arr[left] < pivot) {
                left++;
            };
            while (arr[right] > pivot) {
                right--;
            }
            if (left < right && left <end && right > start) {
                if  (left != pivotIndex) {
                    swap(arr, left, right);
                }
                left++;
                right--;
            }
        }
        if(left > right){
            System.out.println("???????left="+left+"??????right="+right);
        }
        System.out.println("arr["+pivotIndex+"]="+arr[pivotIndex]+"  pivotValue="+pivot +"  arr["+left+"]="+arr[left]+" arr["+right+"]="+arr[left]);
        swap(arr, pivotIndex, left);
        return left;
    }
}
