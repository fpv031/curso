package RevisaoIfElse.situaçoescotidianas;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }

}
