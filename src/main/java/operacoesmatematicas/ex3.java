package operacoesmatematicas;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é divisível por " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " é divisível por " + num1);
        } else {
            System.out.println("Nenhum dos números é divisível pelo outro.");
        }

        sc.close();
    }

}
