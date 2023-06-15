package org.emresezer.B7;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortAlgorithm {
    /* Merge Sort (Birleştirme Sıralama Algoritması)
    Dizi ortadan ikiye bölünür.
    Her iki yarı dizi ayrı ayrı recursive olarak sıralanır.
    Sonra birleştirme işlemi gerçekleştirilir.
    Birleştirme işlemi sırasında elemanlar karşılaştırılır ve sıralı bir şekilde birleştirilir.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Gir: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print((i + 1) + ". Eleman: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Dizimiz : " + Arrays.toString(array));

        mergeSort(array, 0, arrayLength - 1);

        System.out.println("Sıralanmış Dizi: " + Arrays.toString(array));

        scanner.close();
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}