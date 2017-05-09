package com.coderuth.draftlab.four;

import java.util.Random;

public class MergeSort {
    static int n = 5000;

    void merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] resArray = new int[n];
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                resArray[k] = array[i];
                i++;
                k++;
            } else {
                resArray[k] = array[j];
                j++;
                k++;
            }
        }
        while (i <= mid)
            resArray[k++] = array[i++];
        while (j <= high)
            resArray[k++] = array[j++];
        for (int m = low; m <= high; m++)
            array[m] = resArray[m];
    }

    void sort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(array, low, mid);
            sort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] a;
        int num;
        MergeSort m = new MergeSort();
        for (int i = 1; i <= 10; i++) {
            num = i * n;
            System.out.print(num);
            a = new int[num];
            Random r = new Random();
            for (int j = 0; j < num; j++) {
                a[j] = r.nextInt();
            }
            long start = System.currentTimeMillis();
            m.sort(a, 0, n - 1);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println(" " + time);
        }
    }
}