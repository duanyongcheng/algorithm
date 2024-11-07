package com.barry.code.sort;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int l, int r) {
        if (r == l) {
            return;
        }
        int mid = l + (r - l) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int a = l;
        int b = m + 1;
        int i = l;
        int[] help = new int[arr.length];
        while (a <= m && b <= r) {
            if (arr[a] <= arr[b]) {
                help[i++] = arr[a++];
            } else {
                help[i++] = arr[b++];
            }
        }
        while (a <= m) {
            help[i++] = arr[a++];
        }
        while (b <= r) {
            help[i++] = arr[b++];
        }
        while (l <= r) {
            arr[l] = help[l++];
        }
    }
}
