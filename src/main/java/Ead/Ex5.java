package Ead;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        System.out.print("Digite um número para verificar se está na lista: ");
        int numero = sc.nextInt();

        if (numeros.contains(numero)) {
            System.out.println("O número está na lista.");
        } else {
            System.out.println("O número não está na lista.");
        }
    }
}
