package Ead.a;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        System.out.println("Os números digitados foram: " + numeros);
    }
}
