package While;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "senha123";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextLine();
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Senha correta!");
        sc.close();
    }
}
