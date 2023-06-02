package org.emresezer.soru4;

public class MakeATriangle {
    /* Dik üçgen yap. */

    public static void main(String[] args) {
        int toplamYildiz = 10;
        for (int i = 0; i < toplamYildiz; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print(" ");

        }
        // Ters Üçgen
        System.out.println("\n");
        int azalanYildiz = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < azalanYildiz; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            azalanYildiz--;
        }

    }
}
