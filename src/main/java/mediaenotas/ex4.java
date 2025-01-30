package mediaenotas;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da disciplina: ");
        double nota = sc.nextDouble();


        if (nota >= 7) {
            System.out.println("O aluno foi aprovado.");

            if (nota >= 10) {
                System.out.println("O aluno obteve nota máxima (10).");
            }
        } else {
            System.out.println("O aluno foi reprovado.");
        }

        sc.close();
    }
}
