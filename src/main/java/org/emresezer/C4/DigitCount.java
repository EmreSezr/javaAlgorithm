package org.emresezer.C4;

import java.util.Scanner;

public class DigitCount {

    // Kullanıcıdan alınan sayının basamak sayısını çıktı
    // veren program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = 0;

        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        System.out.println("Number of digits: " + digitCount);
    }
}