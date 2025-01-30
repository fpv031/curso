package operacoesmatematicas;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        int lado1 = sc.nextInt();

        System.out.print("Digite o segundo lado do triângulo: ");
        int lado2 = sc.nextInt();

        System.out.print("Digite o terceiro lado do triângulo: ");
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }

        sc.close();
    }

}
