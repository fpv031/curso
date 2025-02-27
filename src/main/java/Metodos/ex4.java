package Metodos;

import java.util.Scanner;

public class ex4 {
    public static void verificarDataNoPeriodo(int dia, int mes, int ano) {
        int inicioAno = 2023;
        int fimAno = 2023;
        boolean dataValida = (ano >= inicioAno && ano <= fimAno);

        if (dataValida) {
            System.out.println("A data está dentro do período.");
        } else {
            System.out.println("A data está fora do período.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês (1 a 12): ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        verificarDataNoPeriodo(dia, mes, ano);
        sc.close();
    }
}
