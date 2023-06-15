package org.emresezer.B8;

import java.util.Arrays;
import java.util.Scanner;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun? : ");
        int listCount = scanner.nextInt();
        int[] list = new int[listCount];

        for (int i = 0; i < listCount; i++) {
            System.out.print(i + 1 + ". Eleman: ");
            list[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(list));

        System.out.print("2. Dizi kaç elemanlı olsun? : ");
        int listCount2 = scanner.nextInt();
        int[] list2 = new int[listCount2];

        for (int i = 0; i < listCount2; i++) {
            System.out.print(i + 1 + ". Eleman: ");
            list2[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(list2));

        int mergedListCount = listCount + listCount2;
        int[] mergedList = new int[mergedListCount];


        for (int i = 0; i < listCount; i++) {
            mergedList[i] = list[i];
        }

        for (int i = 0; i < listCount2; i++) {
            mergedList[listCount + i] = list2[i];
        }

        // Birleştirilmiş diziyi ekrana yazdırın
        System.out.println(Arrays.toString(mergedList));


        scanner.close();
    }

}
