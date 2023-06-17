package org.emresezer.C2;

import java.util.Scanner;

public class NearestPalindromeNumber {
    public static void main(String[] args) {
        // Kullanıcıdan aldığı sayının palindrom olup
        // olmadığı kontrol eden değilse en yakın palindrom sayıyı
        // söyleyen algoritma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println("Girilen sayı bir palindromdur: " + number);
        } else {
            int smallerPalindrome = findSmallerPalindrome(number);
            int largerPalindrome = findLargerPalindrome(number);

            int distanceToSmaller = number - smallerPalindrome;
            int distanceToLarger = largerPalindrome - number;

            if (distanceToSmaller <= distanceToLarger) {
                System.out.println("En yakın palindrom sayı: " + smallerPalindrome);
            } else {
                System.out.println("En yakın palindrom sayı: " + largerPalindrome);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }

    public static int findSmallerPalindrome(int number) {
        int smaller = number - 1;
        while (!isPalindrome(smaller)) {
            smaller--;
        }
        return smaller;
    }

    public static int findLargerPalindrome(int number) {
        int larger = number + 1;
        while (!isPalindrome(larger)) {
            larger++;
        }
        return larger;
    }
}