package RevisaoIfElse.basico;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número " + numero + " está entre 100 e 200.");
        } else {
            System.out.println("O número " + numero + " está fora do intervalo de 100 a 200.");
        }

        sc.close();
    }
}
