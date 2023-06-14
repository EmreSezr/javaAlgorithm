package org.emresezer.B3;

import java.util.Arrays;
import java.util.Scanner;

public class RevertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizideki eleman sayısını giriniz: ");
        int count = sc.nextInt();
        int[] arr = new int[count];


        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ". Elemanı Gir: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Dizi: " + Arrays.toString(arr));

        int[] reverseArr = new int[count];
        for (int i = 0; i < count; i++) {
            reverseArr[i] = arr[count - 1 - i];
        }
        System.out.println("Ters Dizi: " + Arrays.toString(reverseArr));


        sc.close();
    }
}
