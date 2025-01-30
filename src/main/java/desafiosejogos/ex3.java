package desafiosejogos;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 7;

        System.out.print("Tente adivinhar o número secreto entre 1 e 10: ");
        int palpite = sc.nextInt();

        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou o número secreto.");
        } else {
            System.out.println("Tente novamente. O número secreto era " + numeroSecreto);
        }
    }

}
