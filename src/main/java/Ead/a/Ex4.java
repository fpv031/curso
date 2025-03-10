package Ead.a;

import java.util.ArrayList;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(rd.nextInt(100) + 1);
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int numero : numeros) {
            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        System.out.println("Lista de números: " + numeros);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
