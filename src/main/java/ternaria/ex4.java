package ternaria;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é múltiplo de 5: ");
        int numero = sc.nextInt();

        String resultado = (numero % 5 == 0) ? "Múltiplo de 5" : "Não é múltiplo de 5";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
