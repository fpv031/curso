package While;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero >= 0);

        System.out.println("Número negativo digitado, fim.");
        sc.close();
    }
}
