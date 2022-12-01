package Arr_Divide_Conquer;

import java.util.Arrays;

public class DivideConquar {

    public static void divide(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = (ei + si) / 2;
            divide(arr, si, mid);
            divide(arr, mid + 1, ei);

            conquer(arr, si, mid, ei);
        }

    }

    static void conquer(int arr[], int si, int mid, int ei) {
        System.out.println(("working..."));

        int n1 = mid - si + 1;
        int n2 = ei - mid;

        int L[] = new int[n1];
        int M[] = new int[n2];
        // swaping arr in L array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[si + i];
        }
        // swaping arr in M array
        for (int i = 0; i < n2; i++) {
            M[i] = arr[mid + 1 + i];
        }
        //keys for sorting array
        int i, j, k;
        i = 0;
        j = 0;
        k = si;
        // checking array element that key is greater or less and sorting
        while (i < n1 && j < n2) {
            // System.out.println(L[i] <= M[j]);
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        // swapt last element of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // swapt last element of M[]
        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 9, 2, 4, 5 };
        divide(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}
