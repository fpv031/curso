package ternaria;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String dia = sc.nextLine();

        sc.close();

        System.out.println((dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo"))?"\nFim de semana":"\nDia Útil");
    }
}
