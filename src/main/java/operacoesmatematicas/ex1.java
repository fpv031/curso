package operacoesmatematicas;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        if (soma > 100) {
            System.out.println("A soma dos números é maior que 100.");
        } else {
            System.out.println("A soma dos números não é maior que 100.");
        }

        sc.close();
    }

}
