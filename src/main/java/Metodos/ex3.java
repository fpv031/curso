package Metodos;

import java.util.Scanner;

public class ex3 {
    public static void compararPalavras(String palavra1, String palavra2) {
        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais.");
        } else {
            System.out.println("As palavras são diferentes.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();
        compararPalavras(palavra1, palavra2);
        sc.close();
    }
}
