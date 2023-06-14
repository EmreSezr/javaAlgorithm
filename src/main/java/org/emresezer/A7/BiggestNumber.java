package org.emresezer.A7;

import java.util.Scanner;

public class BiggestNumber {

    public static int findMax(int[] numbers) {
        // Dizideki en büyük sayıyı yazdırma
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int count = scanner.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("En büyük sayı: " + findMax(arr));
    }

}
