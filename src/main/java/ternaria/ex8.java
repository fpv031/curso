package ternaria;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
