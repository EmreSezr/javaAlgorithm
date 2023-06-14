package org.emresezer.B2;

import java.util.Scanner;

public class SmallestNumber {
    // Dizideki en küçük sayıyı bulma

    public static int findMin(int[] numbers) {
        // Dizideki en büyük sayıyı yazdırma
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min)
                min = number;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı girileceğini yazınız :");
        int count = scanner.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("En küçük sayı: " + findMin(arr));
    }
}
