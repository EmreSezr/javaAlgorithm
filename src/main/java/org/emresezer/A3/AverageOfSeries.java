package org.emresezer.A3;

import java.util.Random;

public class AverageOfSeries {
    /*Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını alacak programı geliştirin.
        Programı yazarken aşağıdaki özelliklere uygun yazınız.

     * Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin. Sabit elemanlı bir dizi vermeyin!
     * Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
     * Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return)  etsin.

     */
    public static double ortalamaHesap(int[] dizi) {
        double toplam = 0;
        for (int i = 0; i < 100; i++) {
            toplam += dizi[i];
        }

        return toplam / 100;
    }

    public static void main(String[] args) {
        int[] diziler = new int[100];
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int sayi = random.nextInt(100);
            diziler[i] = sayi;
            System.out.print(i+1 + ".sayı:" + diziler[i] + " ");
        }
        double ort = ortalamaHesap(diziler);
        System.out.println("\n Ortalama : " + ort);

    }


}
