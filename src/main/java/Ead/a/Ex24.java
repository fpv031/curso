package Ead.a;

import java.util.ArrayList;

public class Ex24 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
