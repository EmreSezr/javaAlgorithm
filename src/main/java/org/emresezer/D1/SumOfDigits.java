package org.emresezer.D1;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumNumber(int n) {

        int toplamSayi = basamakToplami(n);
        int bulunan = 0;
        int n2 = n + 1;
        boolean sayiBulundu = false;


        while (sayiBulundu == false) {
            basamakToplami(n2);

            if (toplamSayi == basamakToplami(n2)) {
                bulunan = n2;
                sayiBulundu = true;
            } else {
                n2 = n2 + 1;
            }
        }
        return bulunan;
    }

    public static int basamakToplami(int number) {
        int numberLength = String.valueOf(number).length();
        int[] sayi = new int[numberLength];
        int toplamSayi = 0;

        for (int i = 0; i < numberLength; i++) {
            sayi[i] = number % 10;
            toplamSayi += sayi[i];
            number /= 10;
        }
        return toplamSayi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı Yaz: ");
        int number = scanner.nextInt();
        System.out.println(sumNumber(number));
        scanner.close();
    }
}