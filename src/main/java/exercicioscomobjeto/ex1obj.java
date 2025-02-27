package exercicioscomobjeto;

import java.util.Scanner;

public class ex1basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int grande = maiorvalor(num1, num2, num3);


        System.out.println("O maior número é: " + grande);
    }


    public static int maiorvalor(int _X, int _Y, int _Z) {
        int maior = _X;

        if (_Y > maior) {
            maior = _Y;
        }

        if (_Z > maior) {
            maior = _Z;
        }

        return maior;
    }
}

