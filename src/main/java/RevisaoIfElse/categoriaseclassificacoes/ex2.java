package RevisaoIfElse.categoriaseclassificacoes;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 10) {
            System.out.println("Faixa A");
        } else if (num >= 11 && num <= 20) {
            System.out.println("Faixa B");
        } else if (num >= 21 && num <= 30) {
            System.out.println("Faixa C");
        } else {
            System.out.println("Número fora das faixas A, B e C.");
        }
    }

}
