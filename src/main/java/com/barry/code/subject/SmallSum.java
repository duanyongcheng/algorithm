package com.barry.code.subject;

import java.io.*;

public class SmallSum {

    private static int MAXN = 1000001;

    private static int[] HELP = new int[MAXN];

    private static int[] arr = new int[MAXN];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(bufferedReader);
        PrintWriter out = new PrintWriter(System.out);
        while (in.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) in.nval;
            for (int i = 0; i < n; i++) {
                in.nextToken();
                arr[i] = (int) in.nval;
            }
            out.println(smallSum(0, n - 1));
        }
        out.flush();
        out.close();
    }

    private static long smallSum(int l, int r) {
        if (r == l) {
            return 0;
        }
        int mid = l + (r - l) / 2;
        return smallSum(l, mid) + smallSum(mid + 1, r) + merge(l, mid, r);
    }

    private static long merge(int l, int mid, int r) {
        long ans = 0;
        for (int a = l, sum = 0, b = mid + 1; b <= r; b++) {
            while (a <= mid && arr[a] <= arr[b]) {
                sum += arr[a++];
            }
            ans += sum;
        }

        int i = l;
        int a = l;
        int b = mid + 1;

        while (a <= mid && b <= r) {
            HELP[i++] = arr[a] <= arr[b] ? arr[a++] : arr[b++];
        }

        while (a <= mid) {
            HELP[i++] = arr[a++];
        }
        while (b <= r) {
            HELP[i++] = arr[b++];
        }
        for (i = l; i <= r; i++) {
            arr[i] = HELP[i];
        }
        return ans;
    }
}
