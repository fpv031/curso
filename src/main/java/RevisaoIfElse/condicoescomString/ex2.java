package RevisaoIfElse.condicoescomString;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "0120";

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha correta.");
        } else {
            System.out.println("Senha incorreta.");
        }

        sc.close();
    }
}
