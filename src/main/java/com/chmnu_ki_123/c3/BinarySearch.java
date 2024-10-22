package com.chmnu_ki_123.c3;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Знаходимо середній індекс

            // Перевіряємо, чи ключ знаходиться в середньому елементі
            if (arr[mid] == key) {
                return mid; // Ключ знайдений
            }

            // Якщо ключ більший, то ігноруємо ліву частину
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // Інакше ігноруємо праву частину
            else {
                right = mid - 1;
            }
        }

        return -1; // Ключ не знайдений
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Відсортований масив
        int key = 5; // Ключ для пошуку

        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Ключ знайдений на індексі: " + result);
        } else {
            System.out.println("Ключ не знайдений");
        }
    }
}
