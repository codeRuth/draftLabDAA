package com.coderuth.draftlab.five;

import java.util.*;

public class QuickSort {
    private static int n = 5000;
    private static int[] a;
    private static int low;
    private static int high;
    private static int num;

    private static int partition(int l, int h) {
        int i, p = l, piv = a[l];
        for (i = l + 1; i <= h; i++) {
            if (piv > a[i]) {
                a[p] = a[i];
                a[i] = a[p + 1];
                a[p + 1] = piv;
                p++;
            }
        }
        return p;
    }

    public static void quicksort(int l, int h) {
        if (l < h) {
            int m = partition(l, h);
            quicksort(l, m - 1);
            quicksort(m + 1, h);
        }
        return;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            num = i * n;
            System.out.print("\t\t" + num);
            a = new int[num];
            Random r = new Random();
            for (int j = 0; j < num; j++) {
                a[j] = r.nextInt();
            }

            low = 0;
            high = num - 1;
            long start = System.currentTimeMillis();
            quicksort(low, high);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println(" " + time);
        }
    }
}