package org.emresezer.B9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindOdd {
    public static void main(String[] args) {
        /* Kullanıcıdan dizi boyutunu aldığımız ve rastgele bir şekilde değer verdiğimiz
        elemanların hangilerinin tek sayı olduğunu çıktı olarak veriyoruz
        * */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Dizi Kaç Elemanlı Olsun : ");
        int listCount = scanner.nextInt();
        int[] list = new int[listCount];

        for (int i = 0; i < listCount; i++) {
            list[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(list));

        System.out.println("Dizideki Tek Sayılar : ");
        for (int numbers : list) {
            if (!(numbers % 2 == 0)) {
                System.out.print(numbers + " ");
            }
        }


        scanner.close();
    }
}
