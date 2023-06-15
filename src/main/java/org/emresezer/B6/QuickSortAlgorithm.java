package org.emresezer.B6;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortAlgorithm {
    /* Quick Sort (Hızlı Sıralama Algoritması)
    Bir pivot eleman seçilir.
    Pivot elemandan küçük olanlar sol tarafta, büyük olanlar sağ tarafta toplanır.
    Her iki taraf da ayrı ayrı recursive olarak sıralanır.
    Sıralama işlemi tamamlandığında dizi sıralanmış olur.
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

        quickSort(array, 0, arrayLength - 1);

        System.out.println("Sıralanmış Dizi: " + Arrays.toString(array));

        scanner.close();
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}