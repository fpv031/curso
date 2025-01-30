package decisoesfinanceiras;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            System.out.println("Você ganhou um brinde!");
        } else {
            System.out.println("Compra abaixo do valor mínimo para brinde.");
        }
    }
}


