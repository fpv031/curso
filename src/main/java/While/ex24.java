package While;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();
            if (numero >= 0) {
                System.out.println("Raiz quadrada: " + Math.sqrt(numero));
            }
        } while (numero >= 0);
        sc.close();
    }

}
