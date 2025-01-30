package operacoesmatematicas;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int diferenca = num1 - num2;

        if (diferenca < 0) {
            System.out.println("A diferença entre os números é negativa.");
        } else {
            System.out.println("A diferença entre os números não é negativa.");
        }

        sc.close();
    }

}
