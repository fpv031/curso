package ternaria;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano para verificar se é bissexto: ");
        int ano = sc.nextInt();

        String resultado = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) ? "Bissexto" : "Não é bissexto";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
