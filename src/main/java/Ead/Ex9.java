package Ead;

import java.util.ArrayList;
import java.util.Collections;

public class Ex9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            numeros.add(i);
        }

        Collections.reverse(numeros);
        System.out.println("Lista na ordem inversa: " + numeros);
    }
}
