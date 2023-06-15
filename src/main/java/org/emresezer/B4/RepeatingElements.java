package org.emresezer.B4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingElements {
    public static void main(String[] args) {

        // Tekrar eden elemanları  ekrana çıktı olarak veren program

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun? : ");
        int listCount = scanner.nextInt();
        int[] list = new int[listCount];

        for (int i = 0; i < listCount; i++) {
            System.out.print(i + 1 + ". Eleman: ");
            list[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(list));


        findRepeatingElements(list);

        scanner.close();
    }

    public static void findRepeatingElements(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int num : arr) {
            if (elementCountMap.containsKey(num)) {
                elementCountMap.put(num, elementCountMap.get(num) + 1);
            } else {
                elementCountMap.put(num, 1);
            }
        }

        System.out.print("\nTekrar eden elementler--> ");

        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(" " + entry.getKey());
            }
        }
    }
}