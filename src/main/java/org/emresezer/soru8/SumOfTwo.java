package org.emresezer.soru8;

import java.util.Scanner;

public class SumOfTwo {
    // iki sayının toplamını ekrana yazdıran program
    public static int sumNumbers(int a, int b) {
        int toplam = a + b;
        return toplam;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplanacak ilk sayıyı seç: ");
        int a = scanner.nextInt();
        System.out.println("Toplanacak ikinci sayıyı seç: ");
        int b = scanner.nextInt();

        System.out.println("Sonuç : " + (SumOfTwo.sumNumbers(a, b)));
    }
}
