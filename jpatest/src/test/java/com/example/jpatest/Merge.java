package com.example.jpatest;

public class Merge {
    public static void mergeSort(int[]a, int n) {
        if (n<2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];

        for (int i = 0; i < mid ; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i] = a[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n-mid);
}


}

