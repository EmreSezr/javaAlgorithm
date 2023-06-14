package org.emresezer.A1;

import java.util.Scanner;

public class PasswordMatch {
    public static void main(String[] args) {
        // kullanıcıdan şifre alın eğer sistemdeki şifre ile eşleşiyorsa giriş başarılı yazsın
        String password = "12345";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifre giriniz: ");
        String userPass = scanner.nextLine();

        if (userPass.equals(password)) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Şifre yanlış ");
        }


        scanner.close();
    }
}
