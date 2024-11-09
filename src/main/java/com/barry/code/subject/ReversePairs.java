package com.barry.code.subject;

// 测试链接 : https://leetcode.cn/problems/reverse-pairs/
public class ReversePairs {


    private static int MAXN = 100001;

    private static int[] help = new int[MAXN];

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 1};
        System.out.println(reversePairs(arr));
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return 0;
        }
        int mid = l + (r - l) / 2;
        return mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r) + merge(arr, l, mid, r);
    }

    public static int merge(int[] arr, int l, int mid, int r) {
        // 计算反转对的数量
        int ans = 0;
        for (int a = l, b = mid + 1; a <= mid; a++) {
            while (b <= r && arr[a] > (long) 2 * arr[b]) {
                ans += (mid - a + 1);
                b++;
            }
        }

        // 正常的merge
        int i = l;
        int a = l;
        int b = mid + 1;
        while (a <= mid && b <= r) {
            help[i++] = arr[a] <= arr[b] ? arr[a++] : arr[b++];
        }

        while (a <= mid) {
            help[i++] = arr[a++];
        }
        while (b <= r) {
            help[i++] = arr[b++];
        }

        while (l <= r) {
            arr[l] = help[l++];
        }
        return ans;
    }
}
