package Ead.a;

import java.util.ArrayList;

public class Ex22 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
