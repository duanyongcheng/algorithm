package com.barry.sorting;

import com.barry.uilts.Utils;

import java.util.Arrays;

public class TwoPoints {

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 11;
        int maxValue = 100;
        for (int i = 0; i < testTime; i++) {
            int num = (int) (Math.random() * maxValue - 1);
            int[] arr = Utils.buildArray(maxSize, maxValue);
            Arrays.sort(arr);
            int index = twoPointsFind(arr, num);
            int fundIndex = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    fundIndex = j;
                    break;
                }
            }
            System.out.println("执行到第" + i + "次");
            if (index != fundIndex) {
                System.out.println("failed");
                break;
            }
        }
        System.out.println("success");
//        [83, 54, 9, 7, 13, 84, 20, 0, 45, 7, 97]
//        int[] arr = {0, 7, 7, 9, 13, 20, 45, 54, 83, 84, 97};
//        twoPointsFind(arr,7);
    }

    // 查找数组中有没有这个数
    public static int twoPointsFind(int[] arr, int num) {
        int index = -1;
        if (arr == null || arr.length == 0 || arr[0] > num || arr[arr.length - 1] < num) {
            return index;
        }
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (arr[mid] == num) {
                index = mid;
                r = mid - 1;
            } else if (arr[mid] >= num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }
}
