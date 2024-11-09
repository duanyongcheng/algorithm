package com.barry.code.sort;

public class MergeSort {

    private static int MAXN = 50001;

    private static int[] HELP = new int[MAXN];

    public static int[] sortArray(int[] arr) {
        if (arr.length > 1) {
            sort(arr, 0, arr.length - 1);
        }
        return arr;
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
        while (a <= m && b <= r) {
            if (arr[a] <= arr[b]) {
                HELP[i++] = arr[a++];
            } else {
                HELP[i++] = arr[b++];
            }
        }
        while (a <= m) {
            HELP[i++] = arr[a++];
        }
        while (b <= r) {
            HELP[i++] = arr[b++];
        }
        while (l <= r) {
            arr[l] = HELP[l++];
        }
    }
}
