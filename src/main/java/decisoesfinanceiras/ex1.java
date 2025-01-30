package decisoesfinanceiras;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saque <= saldo) {
            System.out.println("Saque autorizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

}
