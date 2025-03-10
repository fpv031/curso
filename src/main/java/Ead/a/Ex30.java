package Ead.a;

import java.util.ArrayList;

public class Ex30 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(-5);
        numeros.add(3);
        numeros.add(-10);
        numeros.add(7);
        numeros.add(-2);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < 0) {
                numeros.set(i, 0);
            }
        }

        System.out.println("Lista após substituir negativos por zero: " + numeros);
    }
}
