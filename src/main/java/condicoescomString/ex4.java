package condicoescomString;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (palavra.length() > 5) {
            System.out.println("A palavra tem mais de 5 caracteres.");
        } else {
            System.out.println("A palavra tem 5 ou menos caracteres.");
        }

        sc.close();
    }
}

