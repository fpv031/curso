package RevisaoIfElse.basico;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 5.");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 5.");
        }

        sc.close();
    }
}
