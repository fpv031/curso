package exercicioscomobjeto;

import java.util.Scanner;

public class ex3basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensagemIdade, mensagemVotacao;

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            mensagemIdade = "Você tem " + idade + " anos.";
            mensagemVotacao = "Você pode votar.";
        } else {
            mensagemIdade = "Você tem " + idade + " anos.";
            mensagemVotacao = "Você não pode votar.";
        }

        System.out.println(mensagemIdade);
        System.out.println(mensagemVotacao);

        sc.close();
    }
}
