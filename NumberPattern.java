package com.java;

public class NumberPattern {

    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];
        int mincol = 0;
        int maxcol = size - 1;
        int minrow = 0;
        int maxrow = size - 1;
        int count = 1;

        while (minrow <= maxrow && mincol <= maxcol) {
            
            for (int i = mincol; i <= maxcol; i++) {
                arr[minrow][i] = count;
                count++;
            }
            minrow++;

            
            for (int i = minrow; i <= maxrow; i++) {
                arr[i][maxcol] = count;
                count++;
            }
            maxcol--;

            
            if (minrow <= maxrow) {
                for (int i = maxcol; i >= mincol; i--) {
                    arr[maxrow][i] = count;
                    count++;
                }
                maxrow--;
            }

            // Fill left column from bottom to top
            if (mincol <= maxcol) {
                for (int i = maxrow; i >= minrow; i--) {
                    arr[i][mincol] = count;
                    count++;
                }
                mincol++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               
                    System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
