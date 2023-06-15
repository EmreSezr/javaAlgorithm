package org.emresezer.A6;

import java.util.Scanner;

public class WordLength {
    // Bir metindeki harf sayısını bulan bir algoritma yazın.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümle veya kelime yazınız(Boşluklar dahildir) :  ");
        String cumle = scanner.nextLine();
        cumle = cumle.trim(); // Baştaki ve sondaki boşlukları kaldırma

        int kelimeSayac = cumle.length() - cumle.replace(" ", "").length();
        int karakterSayac = cumle.length() - kelimeSayac;

        System.out.println("Karakter toplamı : " + karakterSayac);
        System.out.println("Kelime sayısı   : " + (kelimeSayac + 1));

    }
}