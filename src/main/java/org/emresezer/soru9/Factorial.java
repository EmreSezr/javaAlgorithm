package org.emresezer.soru9;

import java.util.Scanner;

public class Factorial {

    // Faktöriyel hesabı yapan program

    public int factorialCalculate(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyel hesabı için sayı giriniz : ");
        int factorialNumber = scanner.nextInt();
        System.out.println("Sonuç : " + (factorial.factorialCalculate(factorialNumber)));
        scanner.close();
    }
    
}



