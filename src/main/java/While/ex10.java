package While;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            contador++;
        } while (numero != 0);

        System.out.println("Você digitou " + (contador - 1) + " números.");
         sc.close();
    }
}
