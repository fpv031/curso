package RevisaoIfElse.situaçoescotidianas;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoCorreto = 1234;  // Código correto de acesso

        System.out.print("Digite o código de acesso: ");
        int codigo = sc.nextInt();

        if (codigo == codigoCorreto) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }

}
