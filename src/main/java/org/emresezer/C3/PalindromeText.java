package org.emresezer.C3;

import java.util.Scanner;

public class PalindromeText {
    // Kelimelerin palindrom olup olmadığını kontrol etmek
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " bir palindromdur.");
        } else {
            System.out.println(str + " bir palindrom değildir.");
        }
    }
}
