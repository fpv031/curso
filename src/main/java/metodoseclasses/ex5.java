package metodoseclasses;

import java.util.Scanner;

public class ex5 {
    public static void verificarMaiorNumero(double num1, double num2, double num3) {
        double maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("O maior número é: " + maior);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();
        verificarMaiorNumero(num1, num2, num3);
        sc.close();
    }
}
