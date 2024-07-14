package com.barry.sorting;

import java.util.Arrays;

import static com.barry.uilts.Utils.*;

public class ThreeFoolsSorting {


    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 11;
        int maxValue = 100;
        for (int i = 0; i < testTime; i++) {
            int[] arr = buildArray(maxSize, maxValue);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            int[] arr3 = copyArray(arr);
            selectSort(arr1);
            bubbleSort(arr2);
            insertSort(arr3);
            Arrays.sort(arr);
            if (!Arrays.equals(arr, arr3)) {
                System.out.println("failed");
                break;
            }
//            if (!Arrays.equals(arr, arr1) || !Arrays.equals(arr, arr2)) {
//                System.out.println("failed");
//                break;
//            }
        }
        System.out.println("success");
    }

    private static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0->n-1 最小
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    private static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j > 0 && j < arr.length ; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(arr, j-1, j);
                }
            }
        }
    }

}
