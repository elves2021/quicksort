package com.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序 Java实现方法
 */
public class Main {
    private static void quickSort(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (array[j] > pivot)) {
                j--;
            }

            while ((i < j) && (array[i] < pivot)) {
                i++;
            }

            if ((i < j) && (array[i] == array[j])) {
                i++;
            } else {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        if (i - 1 > start) {
            quickSort(array, start, i - 1);
        }

        if (j+1 < end) {
            quickSort(array, j+1, end);
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[]{25,30,3,90,5,45,76,22,29,21,1,90,0};
        System.out.println("Before sort:" + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("After sort:" + Arrays.toString(array));
    }
}
