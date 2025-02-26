package Ead;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
    }
}
