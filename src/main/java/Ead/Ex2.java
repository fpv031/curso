package Ead;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            numeros.add(numero);
            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
