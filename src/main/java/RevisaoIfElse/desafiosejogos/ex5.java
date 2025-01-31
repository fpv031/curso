package RevisaoIfElse.desafiosejogos;

import java.util.Random;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numeroSorteado = rd.nextInt(10) + 1;

        System.out.print("Digite um número entre 1 e 10 para tentar acertar o número sorteado: ");
        int palpite = sc.nextInt();

        if (palpite == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número sorteado.");
        } else {
            System.out.println("Que pena! O número sorteado era " + numeroSorteado);
        }
    }

}
