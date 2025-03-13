package gettesestteres.dois;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

        conta.exibirSaldo();

        System.out.print("\nDigite o valor a ser depositado: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("\nDigite o valor a ser sacado: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        conta.exibirSaldo();

        sc.close();
    }
}
