package ternaria;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é positivo e par: ");
        int numero = sc.nextInt();

        String resultado = (numero > 0 && numero % 2 == 0) ? "Sim" : "Não";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
