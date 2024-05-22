package com.mycompany.mysort;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int[] smallArray = {5, 3, 8, 2, 1};
        int[] largeArray = new int[10000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = (int) (Math.random() * 10000);
        }

        // Измерение времени для небольшого массива
        long startTime = System.nanoTime();
        bubbleSort(smallArray.clone());
        long bubbleSortSmallArrayTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        insertionSort(smallArray.clone());
        long insertionSortSmallArrayTime = System.nanoTime() - startTime;

        // Измерение времени для крупного массива
        startTime = System.nanoTime();
        bubbleSort(largeArray.clone());
        long bubbleSortLargeArrayTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        insertionSort(largeArray.clone());
        long insertionSortLargeArrayTime = System.nanoTime() - startTime;

        System.out.println("Время пузырьковой сортировки для небольшого массива: " + bubbleSortSmallArrayTime + " наносекунд");
        System.out.println("Время сортировки вставками для небольшого массива: " + insertionSortSmallArrayTime + " наносекунд");
        System.out.println("Время пузырьковой сортировки для крупного массива: " + bubbleSortLargeArrayTime + " наносекунд");
        System.out.println("Время сортировки вставками для крупного массива: " + insertionSortLargeArrayTime + " наносекунд");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
