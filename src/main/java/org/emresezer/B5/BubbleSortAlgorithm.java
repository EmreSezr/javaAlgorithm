package org.emresezer.B5;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgorithm {
    /* Bubble Sort (Kabarcık Algoritması)
    Veri kümesinden bir eleman alınır.
    Kendinden sonraki veriden büyükse yer değiştiriliyor.
    Diğer veriye geçildikten sonra bu işlem tekrarlanır.
    En son veriye gelindiğinde en büyük elemanımız sonda yer alır.
    Elemanlar küçükten büyüğe sıralanmış olur.
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

        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        /*
        Test Sample Array : [4,3,2]
        step 1 : [3,4,2]
        step 2 : [3,2,4]
        step 3 : [2,3,4]
        over
        }*/

        System.out.println("Sıralanmış Dizi: " + Arrays.toString(array));

        scanner.close();
    }
}
