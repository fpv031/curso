package ternaria;

import java.util.Locale;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Informe sua nota: ");
        double nota = sc.nextDouble();

        sc.close();

        System.out.println((nota >=5 && nota <= 6.9)?"Em recuperação":(nota >= 7)?"Aprovado":"Reprovado");
    }
}
