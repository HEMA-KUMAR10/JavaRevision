package com.java;

import java.util.Scanner;

public class SpiralPattern {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the n value: ");
	        int size = scanner.nextInt();
	        char[][] arr = new char[size][size];
	        int mincol = 0;
	        int maxcol = size - 1;
	        int minrow = 0;
	        int maxrow = size - 1;
	        char count = 'x';
	        char innerChar = 'o';

	        while (minrow <= maxrow && mincol <= maxcol) {
	           
	            for (int i = mincol; i <= maxcol; i++) {
	                arr[minrow][i] = count;
	            }
	            minrow++;

	            
	            for (int i = minrow; i <= maxrow; i++) {
	                arr[i][maxcol] = count;
	            }
	            maxcol--;

	            
	            if (minrow <= maxrow) {
	                for (int i = maxcol; i >= mincol; i--) {
	                    arr[maxrow][i] = count;
	                }
	                maxrow--;
	            }

	           
	            if (mincol <= maxcol) {
	                for (int i = maxrow; i >= minrow; i--) {
	                    arr[i][mincol] = count;
	                }
	                mincol++;
	            }
	            char temp = count;
	            count = innerChar;
	            innerChar = temp;
	        }

	        
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	 {
	                    System.out.print(arr[i][j] + "\t");
	 }
	            }
	            System.out.println();
	        }
	    }
}
