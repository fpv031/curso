package Ead;

import java.util.ArrayList;

public class Ex21 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
