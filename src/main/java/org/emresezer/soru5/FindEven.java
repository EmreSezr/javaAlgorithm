package org.emresezer.soru5;

import java.util.Random;

public class FindEven {
    //Bir dizideki çift sayıları bulan bir algoritma yazın.

    public static void main(String[] args) {
        int[] diziler = new int[100]; //100 tane random elemanlar üretilecek
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int sayi = random.nextInt(100);
            diziler[i] = sayi;
            System.out.print(i + 1 + ".sayı:" + diziler[i] + " ");
        }

        for (int numbers : diziler) {
            if (numbers % 2 == 0) {
                System.out.println(" " + numbers);
            }
        }


    }
}
