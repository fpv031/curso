package Ead.a;

import java.util.ArrayList;

public class Ex25 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Carlos");

        for (String nome : nomes) {
            System.out.println("Olá, " + nome + "!");
        }
    }
}
