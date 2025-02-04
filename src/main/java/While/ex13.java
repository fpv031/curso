package While;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;

        do {
            soma += numero % 10;
            numero /= 10;
        } while (numero > 0);

        System.out.println("Soma dos dígitos: " + soma);
        sc.close();
    }
}
