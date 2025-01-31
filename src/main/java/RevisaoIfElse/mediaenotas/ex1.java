package RevisaoIfElse.mediaenotas;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado com média: " + media);
        } else {
            System.out.println("O aluno foi reprovado com média: " + media);
        }

        sc.close();
    }
}
