package org.emresezer.soru10;


import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        // Kombinasyon  C(N,R) olduğu durumlar için yap
        Scanner sc = new Scanner(System.in);
        System.out.println("C(N,R)");
        System.out.print("N değerini giriniz: ");
        int n = sc.nextInt();
        System.out.print("R değerini giriniz: ");
        int r = sc.nextInt();

        int sonuc = combination(n) / (combination(r) * combination(n - r));
        System.out.println("C(" + n + ", " + r + ") = " + sonuc);
        sc.close();
    }

    public static int combination(int sayi) {
        if (sayi == 0) {
            return 1;
        }

        int sonuc = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }

}
