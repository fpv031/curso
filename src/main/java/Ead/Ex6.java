package Ead;

import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        numeros.removeIf(n -> n % 2 != 0);

        System.out.println("Lista após remover os números ímpares: " + numeros);
    }
}
