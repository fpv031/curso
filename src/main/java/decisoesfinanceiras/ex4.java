package decisoesfinanceiras;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o valor das parcelas: ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.10) {
            System.out.println("A pessoa pode comprar o produto parcelado.");
        } else {
            System.out.println("A pessoa NÃO pode comprar o produto parcelado.");
        }
    }
}
