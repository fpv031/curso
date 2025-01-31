package RevisaoIfElse.decisoesfinanceiras;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valor = sc.nextDouble();

        if (valor > 500) {
            double desconto = valor * 0.10;
            double totalComDesconto = valor - desconto;
            System.out.println("Você recebeu 10% de desconto. O valor total com desconto é: R$ " + totalComDesconto);
        } else {
            System.out.println("Sem desconto. O valor total é: R$ " + valor);
        }
    }

}
