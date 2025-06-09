package ternaria.ex27;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println((num >= 0)?"\nZero ou Positivo":"\nNegativo");
    }
}
