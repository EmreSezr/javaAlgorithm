package org.emresezer.C1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        /* Kullanıcıdan dizi boyutunu aldığımız ve rastgele bir şekilde değer verdiğimiz
        elemanların hangilerinin asal sayı olduğunu çıktı olarak veriyoruz
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

        System.out.println("Dizideki Asal Sayılar : ");
        for (int numbers : list) {
            if (numbers == 2 || isPrime(numbers)) {
                System.out.print(numbers + " ");
            }
        }


        scanner.close();
    }

    public static boolean isPrime(int numbers) {
        // Daha da ayrıntılı bir kod yazacak olursak
        for (int i = 2; i < numbers; i++) {
            if (numbers % i == 0)
                return false;
        }

        if (numbers == 1 || numbers == 2) {
            return false;
        }
        return true;
    }
}
