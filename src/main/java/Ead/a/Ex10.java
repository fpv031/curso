package Ead.a;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número para a lista 1: ");
            lista1.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número para a lista 2: ");
            lista2.add(sc.nextInt());
        }

        // Juntando as duas listas
        lista3.addAll(lista1);
        lista3.addAll(lista2);

        System.out.println("Lista 3 (junção das duas listas): " + lista3);
    }
}
