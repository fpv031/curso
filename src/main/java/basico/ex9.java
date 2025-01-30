package basico;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero >= 10 && numero <= 50) {
            System.out.println("O número " + numero + " está dentro do intervalo de 10 a 50.");
        } else {
            System.out.println("O número " + numero + " não está dentro do intervalo de 10 a 50.");
        }

        sc.close();
    }
}
