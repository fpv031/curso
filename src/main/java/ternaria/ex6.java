package ternaria;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        System.out.print("A pessoa possui carteira de motorista (true/false)? ");
        boolean temCarteira = sc.nextBoolean();

        String resultado = (idade >= 18 && temCarteira) ? "Pode dirigir" : "Não pode dirigir";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}

