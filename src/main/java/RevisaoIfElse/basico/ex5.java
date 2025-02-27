package RevisaoIfElse.basico;

import java.util.Scanner;

public class ex5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String mensagemMaiorNumero;

            System.out.print("Digite o primeiro número: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            System.out.print("Digite o terceiro número: ");
            double num3 = sc.nextDouble();

            double maior = num1;

            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }

            mensagemMaiorNumero = "O maior número é: " + maior;

            System.out.println(mensagemMaiorNumero);

            sc.close();
        }
    }