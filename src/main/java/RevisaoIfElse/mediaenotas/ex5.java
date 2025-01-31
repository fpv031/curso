package RevisaoIfElse.mediaenotas;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da primeira disciplina: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota da segunda disciplina: ");
        double nota2 = sc.nextDouble();

        if (nota1 >= 7 && nota2 >= 7) {
            System.out.println("O aluno foi aprovado nas duas disciplinas.");
        } else {
            System.out.println("O aluno não foi aprovado nas duas disciplinas.");
        }

        sc.close();
    }
}

