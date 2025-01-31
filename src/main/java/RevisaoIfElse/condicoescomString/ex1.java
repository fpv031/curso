package RevisaoIfElse.condicoescomString;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra (Sim ou Não): ");
        String palavra = sc.nextLine();

        if (palavra.equalsIgnoreCase("Sim")) {
            System.out.println("Você escolheu 'Sim'.");
        } else if (palavra.equalsIgnoreCase("Não")) {
            System.out.println("Você escolheu 'Não'.");
        } else {
            System.out.println("Opção inválida. Digite 'Sim' ou 'Não'.");
        }

        sc.close();
    }
}

