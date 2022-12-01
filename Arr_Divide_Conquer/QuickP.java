package Arr_Divide_Conquer;

import java.util.Arrays;

public record QuickP() {

    static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        // swapt starting index in arr who is less than pivot
        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int swaptTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swaptTemp;
            }
        }

        // swapt the pivot element with the greater element specified by i
        int swaptTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swaptTemp;

        // return the position from where partition is done
        return i + 1;
    }

    static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 8, 9, 1 };
        int size = arr.length;
        quickSort(arr, 0, size - 1);
        System.out.println(Arrays.toString(arr));
    }
}
