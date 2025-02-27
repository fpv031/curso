package ternaria;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println((num % 2 == 0 || num % 3 == 0)?"\nDivisível": "\nNão divisível");
    }
}
