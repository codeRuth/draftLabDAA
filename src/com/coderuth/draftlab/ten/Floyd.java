package com.coderuth.draftlab.ten;

import java.util.Scanner;

public class Floyd {
    void floyd(int[][] w, int n) {
        int i, j, k;
        for (k = 1; k <= n; k++)
            for (i = 1; i <= n; i++)
                for (j = 1; j <= n; j++)
                    w[i][j] = Math.min(w[i][j], w[i][k] + w[k][j]);
    }

    public static void main(String[] args) {
        int a[][] = new int[10][10];
        int n, i, j;
        System.out.println("Enter the Number of Vertices : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the Weighted Matrix : ");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
                a[i][j] = sc.nextInt();
        Floyd f = new Floyd();
        f.floyd(a, n);
        System.out.println("The Shortest Path Matrix is : ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}