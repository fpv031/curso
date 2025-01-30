package basico;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = sc.next().charAt(0);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println("O caractere " + caractere + " é uma vogal.");
        } else {
            System.out.println("O caractere " + caractere + " não é uma vogal.");
        }

        sc.close();
    }
}
