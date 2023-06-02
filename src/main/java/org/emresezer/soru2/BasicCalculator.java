package org.emresezer.soru2;

import java.util.Scanner;

public class BasicCalculator {
    /* Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor. Program aşağıdaki özellikleri sağlamalıdır.

     * Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
     * Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama, 2-Çıkarma vb…
     * Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin. Bu girilen iki sayıyı değişkenlerde saklayın.
     * Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın. */


    public static void main(String[] args) {
        System.out.println("\n **** Basit Matematik Hesap Makinesi ****");
        System.out.println(" Yapacağınız İşlemi Seçiniz \n 1) Toplama  \n 2) Çıkarma  \n 3) Çarpma  \n 4) Bölme");
        System.out.print("İşlem : ");
        Scanner scanner = new Scanner(System.in);
        String chooseCategory = scanner.nextLine();

        if (chooseCategory.equals("1")) {
            System.out.println("Toplama işlemi yapılıyor...");
            System.out.println("İşlem yapılacak iki sayıyı seçiniz");
            System.out.print("İlk Sayı : ");
            int firstNumber = scanner.nextInt();
            System.out.print("İkinci Sayı : ");
            int secondNumber = scanner.nextInt();
            int sonuc = firstNumber + secondNumber;
            System.out.println("SONUÇ : " + sonuc + "\n Çıkış yapılıyor...");

        } else if (chooseCategory.equals("2")) {
            System.out.println("Çıkarma işlemi yapılıyor...");
            System.out.println("İşlem yapılacak iki sayıyı seçiniz");
            System.out.print("İlk Sayı : ");
            int firstNumber = scanner.nextInt();
            System.out.print("İkinci Sayı : ");
            int secondNumber = scanner.nextInt();
            int sonuc = firstNumber - secondNumber;
            System.out.println("SONUÇ : " + sonuc + "\n Çıkış yapılıyor...");

        } else if (chooseCategory.equals("3")) {
            System.out.println("Çarpma işlemi yapılıyor...");
            System.out.println("İşlem yapılacak iki sayıyı seçiniz");
            System.out.print("İlk Sayı : ");
            int firstNumber = scanner.nextInt();
            System.out.print("İkinci Sayı : ");
            int secondNumber = scanner.nextInt();
            int sonuc = firstNumber * secondNumber;
            System.out.println("SONUÇ : " + sonuc + "\n Çıkış yapılıyor...");

        } else if (chooseCategory.equals("4")) {
            System.out.println("Bölme işlemi yapılıyor...");
            System.out.println("İşlem yapılacak iki sayıyı seçiniz");
            System.out.print("İlk Sayı : ");
            double firstNumber = scanner.nextInt();
            System.out.print("İkinci Sayı : ");
            double secondNumber = scanner.nextInt();
            double sonuc = (firstNumber / secondNumber);
            System.out.println("SONUÇ : " + sonuc + "\n Çıkış yapılıyor...");

        } else {
            System.out.println("Hatalı seçim, kapatılıyor...");
        }


        scanner.close();
    }
}
